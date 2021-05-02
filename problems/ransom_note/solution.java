class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        
        Map<Character, Integer> m = new HashMap(); // track freq of characters in ransomNote
        
        for(Character c: magazine.toCharArray()){
            if(m.containsKey(c)) 
                    m.put(c, m.get(c)+1);
            else m.put(c, 1);
        }
        
        for(Character c: ransomNote.toCharArray()){
            if(m.containsKey(c) && m.get(c) > 0) 
                m.put(c, m.get(c)-1);
            else return false;
        }
        
        return true;
    }
}