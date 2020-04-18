class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> set = new LinkedHashSet<>();
        for(int v : nums) set.add(v);
        
        int i = 0;
        for(int v : set) {
            nums[i] = v;
            i++;
        }
        
        return set.size();
    }
}