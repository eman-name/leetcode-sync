class Solution {
    public String[] uncommonFromSentences(String A, String B) {
        
        // segment words from sentences A and B
        String delimiter = " ";
        String[] wA = A.split(delimiter);
        String[] wB = B.split(delimiter);
        
        // store uncommon words in set
        // a word is uncommon if it appears exactly once
        Set<String> S = new HashSet<String>();
        Set<String> seen = new HashSet<String>();
        
        for(String s: wA) {
            if(!S.add(s) || seen.contains(s)) S.remove(s);
            seen.add(s);
        }
        
        for(String s: wB) {
            if(!S.add(s) || seen.contains(s)) S.remove(s);
            seen.add(s);
        }
        
        // format the uncommon words in String[]    
        return S.toArray(new String[S.size()]);   
    }
}