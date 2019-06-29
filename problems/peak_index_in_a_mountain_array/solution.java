class Solution {
    public int peakIndexInMountainArray(int[] A) {
        
        // assuming A is mountain
        
        int l = A.length-1, lo = 0,  mi = l/2, hi = l; // track window for binary search
        
        while (mi < hi) {
            
            if(A[mi] > A[mi-1] && A[mi] > A[mi+1] ) // peak found
                return mi; 
            
            if (A[mi] < A[mi+1]) lo = mi+1; // chop window
            else hi = mi;
            mi = lo + (hi-lo) /2;
        }
        
        return -1;
        
    }
}