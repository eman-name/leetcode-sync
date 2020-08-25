class Solution {
    public int maxSubArray(int[] nums) {
        int maxSeen = nums[0];
        int maxEndingHere = nums[0];

        for(int i = 1; i < nums.length; i++) {
            maxEndingHere = Math.max(nums[i], maxEndingHere+nums[i]);
            maxSeen = Math.max(maxSeen, maxEndingHere);
        }
        return maxSeen;
    }

}
