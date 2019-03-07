class Solution {
    public int reverse(int x) {
        
        if (x == 0) return 0;
        
        long number = Math.abs((long) x), sum = 0;
        
        while (number != 0) {
		    sum = sum * 10 + number % 10;
		    number = number / 10;
	    }
        
        if (sum > Integer.MAX_VALUE ||  -1* sum < Integer.MIN_VALUE)
		    return 0;
        
        return (int) ((x < 0) ? -1*sum : sum);
    }
}