class Solution {
    public boolean isPalindrome(int x) {
        if( x < 0 ) return false;

        int y = x, r = 0; 
        while(y != 0) {
            r = 10*r + y%10;
            y = y/10;
        }
        
        return (r == x);
        
    }
}