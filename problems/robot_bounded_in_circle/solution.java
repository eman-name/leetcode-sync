class Solution {
    public boolean isRobotBounded(String instructions) {
        char[] inst = instructions.toCharArray();
        int x = 0;
        int y = 0;
        int o = 1; // where 0,1,2,3 used to designate 0,90,180,270 degrees
        int[] degrees = {0, 90, 180, 270};
        
        for(int i = 0; i < inst.length; i++) {
            
            int index = i%inst.length;
            
            // track orientation during left turn
            if(inst[index] == 'L') {
                System.out.println(i + ": L");
                if(o == 3 && inst[index] == 'L') o = 0;
                else o++;
            }
            
            // track right turn
            if(inst[index] == 'R') {
                System.out.println(i + ": R");
                if(o == 0 && inst[index] == 'R') o = 3;
                else o--;
            }
            
            // go straight
            if(inst[index] == 'G'){
                System.out.println(i + ": G");
                if(o == 0) x++;
                if(o == 1) y++;
                if(o == 2) x--;
                if(o == 3) y--;
            }
            
            System.out.println("position: (" + x + "," + y + ")" );
            System.out.println("orientation:" + degrees[o]);
        }
        
        return (x==0 && y==0) || o != 1;
    }
}