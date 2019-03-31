class Solution {
    
    // Return the smallest possible range 
    // of values in B[] = A[]+x where -K <= x <= K 
    // N log N
    public int smallestRangeI(int[] A, int K) {
        return inlineSmallestRangeI(A, K);
    }
    
    // O(N Log N)
    private int logSmallestRangeI(int[] A, int K) {
        Arrays.sort(A); // O(n log n); dual-pivot quick sort
        return getRange(A[0], A[A.length-1], K); //O(1)
    }
    

    private int inlineSmallestRangeI(int[] A, int K) {
        
        for(int i = 0, min = A[0], max = A[0] ; i < A.length; i++) { // O(N)
            min = Math.min(min, A[i]);
            max = Math.max(max, A[i]);
            if(i == A.length - 1) return getRange(min, max, K);
        }
        
        return -1;
    }
    

    private int getRange(int min, int max, int K) {
        return Math.max(0, (max-K) - (min+K));
    } 
}