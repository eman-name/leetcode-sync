class Solution {
    public boolean halvesAreAlike(String s) {
        s = s.toLowerCase();
        
        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        
        int A = 0, B = 0;
        
        for(int i = 0; i < s.length(); i++) {
            if(vowels.contains(s.charAt(i))) {
                if(i < s.length()/2) A++; 
                else B++;
            } 
        }
        
        return A==B;
    }
}