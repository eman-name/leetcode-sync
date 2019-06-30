class Solution {
    public int majorityElement(int[] nums) {
     
        Map<Integer, Integer> m = new HashMap<>();
        
        for(int n: nums){
            int t = 1;
            if(m.containsKey(n)) {
                t = m.get(n)+1;
                if(t > nums.length/2) return n;
                m.put(n, t);
            
            }
            
            else m.put(n,t);
            
        }
        
        return nums[0];
        
    }
}