class Solution {
    
    public String removeDuplicates(String S) {
        StringBuilder sb = new StringBuilder(S);    
        
        for(int i = 0; i < S.length()-1; i++){
            if(S.charAt(i) == S.charAt(i+1)) {
                S = new StringBuilder(S).delete(i,i+2).toString();
                i = -1;
            }       
        }
        
        return S;
    }
        
}