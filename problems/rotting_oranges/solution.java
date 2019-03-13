class Solution {
    
    // offsets for accessing 4-directional neighbors
    int[] dR = {-1,0,1,0};
    int[] cR = {0,-1,0,1};
    
    public int orangesRotting(int[][] grid) {
        
        Deque<Integer> q = new ArrayDeque<>(); //  store items to be processed
        Map<Integer,Integer> m = new HashMap<>(); // store entire processing history
        
        int R = grid.length; // num rows
        int C = grid[0].length; // num colums
        
        // add all rotten oranges to queue
        for(int r = 0; r<R; r++) {
            for(int c = 0; c<C; c++) {
                int code = r*C+c;
                if(grid[r][c]==2) {
                    q.offer(code);
                    m.put(code, 0);
                }
            }
        }
        
        int depth = 0;
        while(!q.isEmpty()) {
            int code = q.poll();
            int r = code / C, c = code % C;     
            
            // update neighbors
            for(int i = 0; i < 4; i++) {
                int nR = r + dR[i];
                int nC = c + cR[i];
                if(nR >= 0 && nR < R && nC >= 0 && nC < C && grid[nR][nC] == 1) {
                    grid[nR][nC] = 2; 
                    int nextCode = nR * C + nC;
                    int nextDepth = m.get(code)+1;
                    q.offer(nextCode);
                    m.put(nextCode, nextDepth);
                    if(nextDepth > depth) depth = nextDepth;
                }
            }
            
        }
        
        for(int[] row: grid)
            for(int i: row)
                if(i==1) return -1;
        
        
        return depth;
    }
    
}