class Solution {
     
    public int[] runningSum(int[] nums) {
        int[] r = new int[nums.length];
        for(int i = 0; i < nums.length; i++) r[i] = (i==0) ? nums[i] : nums[i] + r[i-1];
        return r;
    }
    
}