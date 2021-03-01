class Solution {
    // ASCII to integer
    public int myAtoi(String s) {
        s = s.trim(); // remove leading whitespace
        if(s.length() == 0) return 0; // handle empty string
        
        
        
        // track if string represents a negative number
        boolean negate = false; 
        boolean positive = false;
        if(s.charAt(0) == '-') negate = true;
        if(s.charAt(0) == '+') positive = true;
        
        int r = 0; // stored value to be returned
        char[] c = s.toCharArray(); // convert String to character array for traversal by index
        
        
        // find position of first non-digit character; if string contains non-digits
        int e = c.length;
        for(int i = (negate || positive) ? 1 : 0; i < c.length; i++) {
            System.out.println("numeric value of '" + c[i] + "' is " + Character.getNumericValue(c[i]));
            if (Character.getNumericValue(c[i]) < 0 || Character.getNumericValue(c[i]) > 9) {
                e = i;
                break;
            }
        }
        
        for(int i = (negate || positive) ? 1 : 0; i < e; i++) {
            int d = Character.getNumericValue(c[i]); // get integer from character
            int p = e - i; // get place
            if(negate) r -= d*(10 * Math.pow(10, p-2));
            else r += d*(10 * Math.pow(10, p-2));
            
            System.out.println("digit: " + d + " place: " + p );
        }
        
        return r;
    }
}