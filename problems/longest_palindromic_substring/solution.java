class Solution {
    
    int hi;
    int lo;
    
    public String longestPalindrome(String s) {
        if(s.length() < 2 ) return s;
              
        for(int i = 0; i < s.length() -1; i++) {
            localPalindrome(s, i, i); // 1-char inflection candidate palindrome 
            localPalindrome(s, i, i+1); // 2-char inflection candidate palindrome 
        }
        
        return s.substring(lo,hi+1);
    }
    
    private void localPalindrome(String s, int a, int b) {
        while(a > -1 && b < s.length() && s.charAt(a) == s.charAt(b) ) {
            if( b-a > hi-lo ) { // compare local palindrome vs. global palindrome length
                hi = b; 
                lo = a;
            }
            
            a--; 
            b++;
        }
    }
    
}