class Solution {
    private boolean[] selected;
        
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int n: nums) sum += n;
        if(sum%2 == 1) return false;
        int target = sum/2;
        Arrays.sort(nums);
        return hasSubsetSum(nums, target, 0);
        
    }
    
    // Assume
    // returns true if array nums contains a subset with sum equal to target
    // @luckygirl implementation of dfs
    private boolean hasSubsetSum(int nums[], int target, int index) {
        
        //base case 
        if (target == 0) return true;
        
        for(int i = index; i < nums.length; i++) {
            if (i > index && nums[i] == nums[i-1]) continue;
            if(nums[i] > target) break;
            if(hasSubsetSum(nums, target-nums[i], i+1)) return true;
        }
        
        return false;
    }
    
}