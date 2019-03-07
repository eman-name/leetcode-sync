class Solution {
    public List<String> commonChars(String[] A) {
        int[] dict = countOccurences(A[0].toCharArray());
            
        for(int i=1; i<A.length; i++) 
            dict = minOccurences(dict, countOccurences(A[i].toCharArray()));
        
        return formatAnswer(dict);
        
    }
    
    // count the number of occurrences of each letter given a character array
    private int[] countOccurences(char[] c){
        int[] dict =  new int[26];
        for(int i=0; i<c.length; i++ ) {
            dict[c[i]-'a']++; 
        }
        return dict;
    }
    
    // used to update dictionary with the current minimum occurrence of each letter
    private int[] minOccurences(int[] a, int[] b) {
        for(int i = 0; i<a.length; i++) {
            if(a[i] > b[i]) a[i] = b[i];
        }
        return a;
    }
    
    // convert the int[] character count dictionary int List<String> format
    private List<String> formatAnswer(int[] a) {
        List<String> l = new LinkedList<>();
        
        for(int i=0; i<a.length; i++ )
            for(int j=0; j<a[i]; j++) 
                l.add(Character.toString((char) ('a' + i)));
        
        return l;
    }
    
}