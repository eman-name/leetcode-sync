class Solution {
    
    /**
     * linear time fibonacci contruction 
     * @return - fib(N) = fib(N - 1) + fib(N - 2) for 0 ≤ N ≤ 30
     */
    public int fib(int N) {
        if(N==0) return 0;
        if(N==1) return 1;
        
        Map<Integer, Integer> solutions = new HashMap<Integer, Integer>();
        solutions.put(0,0); 
        solutions.put(1,1);
        
        for (int i = 2; i <= N; i++) 
            solutions.put(i, solutions.get(i-1) + solutions.get(i-2));    
    
        return solutions.get(N);    
    }
    
    
}