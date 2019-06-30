class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer,Integer> m = new HashMap<>();
        
        for(int n: nums) {
            if(m.containsKey(n)) m.put(n, 1 + m.get(n));
            else m.put(n, 1);
        }

        for(int n: nums) if(m.get(n) == 1) return n;
        
        return -1;
    }
}