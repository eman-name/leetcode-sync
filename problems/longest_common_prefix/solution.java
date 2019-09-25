class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0) return "";
        
        // grab first word, set as prefix
        String prefix = strs[0];
            
        // iterate through list of words
        // and track the longest prefix observed so far
        for(int i = 0; i < strs.length; i++) 
            prefix = commonPrefix(prefix,strs[i]);
        
        return prefix;
        
    }
    
    public String commonPrefix(String a, String b) {
        StringBuilder sb = new StringBuilder();
        char[] x = a.toCharArray();
        char[] y = b.toCharArray();
        
        int n = Math.min(x.length, y.length);
        
        for(int i = 0; i < n; i++) {
            if(x[i] == y[i]) sb.append(x[i]); 
            else break;   
        }
        
        return sb.toString();
        
    }
}

