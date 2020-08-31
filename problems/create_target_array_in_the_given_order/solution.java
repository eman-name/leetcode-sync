class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        
        int[] target = new int[nums.length];
        List<Integer> l = new LinkedList<>();
        
        for(int i = 0; i < target.length; i++) l.add(index[i], nums[i]);
        for(int i = 0; i < target.length; i++) target[i] = l.get(i);
    
        return target;
        
    }
}