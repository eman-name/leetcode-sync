class Solution {
    public int searchInsert(int[] nums, int target) {
        int ret = nums.length;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == target || nums[i] > target) return i;
        }
        return ret;
    }
}