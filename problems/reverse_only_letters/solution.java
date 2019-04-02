class Solution {
    public String reverseOnlyLetters(String S) {
        
        String matchNonAlpha = "[^a-zA-Z]+";        
        char[] C = S.toCharArray();
        String letters = new StringBuilder(S.replaceAll(matchNonAlpha, "")).reverse().toString();

        for(int i = 0, j = 0; i<C.length; i++) {
            if(Character.isLetter(C[i])){
                C[i] = letters.charAt(j); j++;
            }
        }
        
        return new String(C);
    }
}