class Solution {
    public int numJewelsInStones(String J, String S) {
        int jewels = 0;
        
        List<Character> l = new ArrayList<>();
        
        for(char c: J.toCharArray()) l.add(c);
        
        for(char c: S.toCharArray()){
            // does J contain c?
            if(l.contains(c)) jewels++;
        }
        
        return jewels;
        
    }
}