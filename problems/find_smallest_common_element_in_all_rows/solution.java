class Solution {

    // strictly increasing => sorted array >> sorted array can leverage binarySearch for log(n) lookup
    public int smallestCommonElement(int[][] mat) {
        int n = mat.length; // num rows
        int m = mat[0].length; // num columns
        
        for(int col = 0; col < m; col++) {
            boolean found = true;
            for(int row = 1; row < n; row++) {
                found = Arrays.binarySearch(mat[row], mat[0][col]) >= 0;
                if(!found) break; 
            }
            if(found) return mat[0][col];
        }
        
        return -1;
        
    }
}