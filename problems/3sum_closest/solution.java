class Solution {
    public int threeSumClosest(int[] nums, int target) {
        
        Arrays.sort(nums);
        
        int closest = nums[0] + nums [1] + nums[2];
        
        for(int i=0; i<nums.length; i++){
            int j = i+1;
            int k = nums.length-1;
            
            while(j<k) {
                int cur = nums[i] + nums[j] + nums[k];
                closest = Math.abs(cur-target) < Math.abs(closest-target) ? cur : closest;
                
                if(cur == target) return cur;
                if(cur > target) k--; 
                else j++;
            }
        }
       return closest;
    }
}