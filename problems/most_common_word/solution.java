class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        
        paragraph = paragraph.toLowerCase();
        paragraph = paragraph.replaceAll("\\p{Punct}"," ");
        System.out.println(paragraph);
        String[] words = paragraph.trim().split("\\s+");
        
        // track the most repeated word
        int n = 0;
        String ret = null;
        
        Set<String> b = new HashSet();
        for (String word : banned) b.add(word);
        
        Map<String, Integer> map = new HashMap<>();
        for (String w : words) {
            
            if(!b.contains(w)) {
                if(map.containsKey(w)) 
                    map.put(w, map.get(w) + 1);
                else 
                    map.put(w, 1);
            
                if(map.get(w) > n ) {
                    n = map.get(w);
                    ret = w;
                }
            }
        }
        
        return ret;
        

    }
}