class Solution {

    private Map<Integer, Integer> maxrow = new HashMap<>();
    private Map<Integer, Integer> maxcol = new HashMap<>();    
        
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        
        int count = 0;
        
        for(int i=0; i< grid.length; i++) {
            for(int j=0; j < grid[i].length; j++) {
                int skyline = Math.min(maxInRow(grid, i), maxInCol(grid, j));
                int height = grid[i][j];
                count += (skyline > height) ? skyline - height : 0;
            }
        }
            
        return count;
    }
    
    /**
     * Given 2D array and row
     * find the maximum int value in a row
     */
    private int maxInRow(int[][] grid, int row){
        
        if(maxrow.containsKey(row)) return maxrow.get(row);
        
        int max = 0;
        for(int i=0; i < grid[0].length; i++) 
            max = max > grid[row][i] ? max : grid[row][i];
        
        maxrow.put(row, max);
        
        return max;
    }
    
    /**
     * Given 2D array and col
     * find the maximum int value in a col
     */
    private int maxInCol(int[][] grid, int col){
        if(maxcol.containsKey(col)) return maxcol.get(col);
        
        int max = 0;
        for(int i=0; i< grid.length; i++) 
            max = max > grid[i][col] ? max : grid[i][col];
        
        maxcol.put(col, max);
        
        return max;
    }
    

}