class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuffer s1 = new StringBuffer();
        StringBuffer s2 = new StringBuffer(); 
        for(String p : word1) s1.append(p);
        for(String p : word2) s2.append(p);
        return (s1.toString().equals(s2.toString()));   
    }
}