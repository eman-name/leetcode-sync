class Solution {
    public boolean canPermutePalindrome(String s) {
        Map<Character, Integer> m = new HashMap<>(); // track frequency of terms
        
        for(Character c: s.toCharArray()) {
            if(m.containsKey(c)) m.put(c, m.get(c)+1);
            else m.put(c, 1);
        }
        
        int odd = 0;
        
        // check if no more than 1 letter occurs an odd number of times
        for(Map.Entry<Character, Integer> e: m.entrySet()){
            if(e.getValue() % 2 == 1) odd++; 
            if (odd > 1) return false;
        }
        
        return true;
    }
}