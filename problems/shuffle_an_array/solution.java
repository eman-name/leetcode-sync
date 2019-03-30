class Solution {

    private int[] s;
    private int[] r;
    private List<Integer> p;
    private Random rand = new Random();
    
    public Solution(int[] nums) {
        s = nums.clone();
        r = nums.clone();
    }
    
    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        return r;
    }
    
    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        p = new LinkedList();
        
        for(int i: r) p.add(i);        
        
        for(int i = p.size()-1; i >= 0; --i) 
                s[i] = p.remove(rand.nextInt(p.size()));

        return s;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */