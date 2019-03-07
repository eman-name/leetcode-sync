class Solution {
    public boolean judgeCircle(String moves) {
        
        int v=0; // track the netw vertical distance (D = -1, U = +1)
        int h=0; // track the net horizontal distance (L = -1, R = +1)
        
        for(char c: moves.toCharArray()) {
            if(c=='R') ++h;
            if(c=='L') --h;
            if(c=='U') ++v;
            if(c=='D') --v;
        }
        
        if(v==0 && h==0) return true;
        return false;
    }
}