class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] r = new int[nums.length];
        
        for(int i = 0, j = 0; i < n; i++, j += 2 ) {
            r[j] = nums[i];
            r[j+1] = nums[n+i];
        }
            
        
        return r;
    }
}