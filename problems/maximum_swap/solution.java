class Solution {
    public int maximumSwap(int num) {
        char[] c = Integer.toString(num).toCharArray();
        int n = c.length;

        // swap first two swapable elements 
        for(int i = 0; n > 1 && i < n-1; i++) {
            
            // find max number from remaining elements
            char max = 0;
            int index = -1;
            for(int j = i+1; j < n; j++) {
                if(c[j] >= max) {
                  max = c[j];
                  index = j;
                }
            }
            
            if(max > c[i]) { // swap
                char temp = c[index]; c[index] = c[i]; c[i] = temp;
                break;
            } 
        }
        
        return Integer.valueOf(new String(c));
    }
}