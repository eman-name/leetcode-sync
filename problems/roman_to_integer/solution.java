class Solution {
    public int romanToInt(String S) {
        
        int val = 0;
        char prev = 'Z';
        
        for(char c: S.toCharArray()) {
            int inc = 0;
            switch(c) {
                case 'I': inc = 1; break;
                case 'V': inc = (prev == 'I') ? 3     : 5; break;
                case 'X': inc = (prev == 'I') ? 8     : 10; break;
                case 'L': inc = (prev == 'X') ? 30    : 50; break;
                case 'C': inc = (prev == 'X') ? 80    : 100; break;
                case 'D': inc = (prev == 'C') ? 300   : 500; break;
                case 'M': inc = (prev == 'C') ? 800   : 1000; break;
            }
            val = val + inc;
            prev = c;
        }
        
        return val;
    }
}