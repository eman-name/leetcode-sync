class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        if (matrix.length == 0 || matrix[0].length == 0) return false;
        
        int r = matrix.length;
        int c = matrix[0].length;
        int i = 0, j = c-1;
        
        while (i < r && j >= 0) {
            //System.out.print("[" + matrix[i][j] + "]" + " >> " );
            if(matrix[i][j] == target) return true;
            else if(matrix[i][j] < target) i++;
            else j--;
        }
        
        return false;
    }
    

    
}