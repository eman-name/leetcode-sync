class Solution {
    public int firstUniqChar(String s) {
        
        Map<Character, Integer> map = new HashMap<>(); // track index of unique chars
        
        for(int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            if(map.get(c) == null) map.put(c, 1);
            else map.put(c, 1 + map.get(c));
        }
        
        int ret = -1;
        for(int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            if(map.get(c) == 1) return i;
        }
        
        return ret;
    }
    
    // O(2N) ~> O(N)
}