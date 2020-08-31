class Solution {
    
    public int[] decompressRLElist(int[] nums) {
        
        // [freq, val] = [nums[2*i], nums[2*i+1]]
        
        // decompress
        List<Integer> l = new LinkedList<>();
        for(int i = 0; i < nums.length; i += 2) {
            int freq = nums[i];
            int val = nums[i+1];
            for(int j = 0; j < freq; j++) l.add(val);
        }
        
        // convert List<Integer> to int[]
        int[] ret = new int[l.size()];
        for(int i = 0; i < ret.length; i++) ret[i] = l.get(i);
        return ret; 
    }
    
}