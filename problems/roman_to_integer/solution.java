class Solution {
    
     public Map<Character, Integer> m;
    
    // String s - is a valid format Roman numeral
    // return - int value of String s
    public int romanToInt(String s) {
        
        m = new HashMap<>();
        m.put('I', 1);
        m.put('V', 5);
        m.put('X', 10);
        m.put('L', 50);
        m.put('C', 100);
        m.put('D', 500);
        m.put('M', 1000);
        
        return  convert(s.toCharArray());     
    }
    
    
    private int convert(char [] c){
        int ans = 0;
        for(int i = 0; i< c.length; i++) {
            if(i<c.length-1) {
                if(c[i] == 'I' && c[i+1] == 'V')        { ans += 4;     i++;} 
                else if (c[i] == 'I' && c[i+1] == 'X')  {ans += 9;      i++;}
                else if (c[i] == 'X' && c[i+1] == 'L')  {ans += 40;     i++;}
                else if (c[i] == 'X' && c[i+1] == 'C')  {ans += 90;     i++;}
                else if (c[i] == 'C' && c[i+1] == 'D')  {ans += 400;    i++;}
                else if (c[i] == 'C' && c[i+1] == 'M')  {ans += 900;    i++;}
                else ans += m.get(c[i]);
            }
            else ans += m.get(c[i]);
        }
        
        return ans;   
    }
}