class Solution {
    public int findNumbers(int[] nums) {
        int ret = 0;
        for(int n : nums) if( (n + "").length() % 2 == 0) ret++;
        return ret;
    }
}