class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        
        String[] CODES = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        
        Set<String> map = new HashSet<>();
        
        for (String w : words) { // transform words to morse code representation; w -> m
            StringBuilder b = new StringBuilder();
            for (Character c: w.toCharArray()) {
                b.append(CODES[c -'a']);
            }
            map.add(b.toString());
        }

        return map.size(); 
    }
}