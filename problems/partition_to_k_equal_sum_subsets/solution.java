class Solution {
    
    public boolean canPartitionKSubsets(int[] nums, int k) {
        int sum = 0, max = 0;
        
        for(int i: nums) { sum += i; max = Math.max(max, i);  }
        if(sum%k != 0 || max > sum/k ) return false; // k must be a divisor of the sum for there to be k equivalent partitions
        
        return hasKSubSetSum(nums, new boolean[nums.length], sum/k, 0, 0, k);
    }
    
    // approach - 2-stage modified subsetsum dfs
    // @see GraceMeng's solution
    private boolean hasKSubSetSum(int[] nums, boolean[] visited, int target, int sum, int index, int k) {
        
        if(k==0) return true; // base case: found all subgroups
        if(sum > target) return false;
        if(sum == target) return hasKSubSetSum(nums, visited, target, 0, 0, k-1); // found subgroup, search for next
        
        for(int i = index; i < nums.length; i++) {
            if(!visited[i]) {
                visited[i] = true;
                if(hasKSubSetSum(nums, visited, target, sum + nums[i], i+1, k)) return true;
                visited[i] = false;
            }
        }
        
        return false;
    }
    
}