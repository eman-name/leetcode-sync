class Solution {
    public boolean isAnagram(String s, String t) {
        
        // 2 implementations
        //return sort(s,t); // O(N log N)
        return hashtable(s,t); // O(N)
        
    }
    
    private boolean sort(String s, String t) {
        if(s.length() != t.length()) return false;
        
        char[] sc = s.toCharArray();
        char[] tc = t.toCharArray();
        
        Arrays.sort(sc); 
        Arrays.sort(tc); 
        
        for(int i = 0; i<sc.length; i++ ) {
            if(sc[i] != tc[i]) return false;
        }

        return true;
    }
    
    private boolean hashtable(String s, String t) {
        if(s.length() != t.length()) return false;
        
        int[] sm = new int[26];
        int[] tm = new int[26];
        
        char[] sc = s.toCharArray();
        char[] tc = t.toCharArray();
        
        for(int i = 0; i<sc.length; i++ ) {
            char c = sc[i];
            sm[c -'a']++;
        }
        
        for(int i = 0; i<tc.length; i++ ) {
            char c = tc[i];
            tm[c -'a']++;
        }
        
        for(int i = 0; i<sm.length; i++ ){
            if(sm[i] != tm[i]) return false;
        }
        
        return true;
            
    }
    
    
}