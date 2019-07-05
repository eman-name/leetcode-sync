class Solution {
    public int titleToNumber(String s) {
        
        int col = 0;
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int place = s.length() - i - 1;
            col += Math.pow(26, place)*(c - 'A' + 1);
        }
        
        
        return col;
    }
}