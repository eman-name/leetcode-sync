class Solution {
    public int removeElement(int[] nums, int val) {
        List<Integer> l = new LinkedList<>();
        for(int n: nums) if (n!= val ) l.add(n);
        for(int i = 0; i < l.size(); i++) nums[i] = l.get(i);
        return l.size();
    }
}