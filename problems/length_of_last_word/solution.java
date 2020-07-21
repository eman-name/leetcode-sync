class Solution {
    public int lengthOfLastWord(String s) {
        String[] S  = s.split("\\s");
        if (S.length == 0) return 0;
        return S[S.length-1].length();
    }
}