class Solution {
    public int balancedStringSplit(String s) {
        int ret = 0;
        int t = 0;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'R') t++;
            else t--;
            if( t == 0 && i > 0 ) ret ++;
        }
        
        return ret;
    }
}