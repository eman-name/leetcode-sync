class Solution {
    public List<Integer> addToArrayForm(int[] A, int K) {
        
        List<Integer> ans = new ArrayList();
        int carry = K;
        int N = A.length-1;
        
        for(int i = N; i >= 0 || carry > 0; i--) {
            if( i >= 0 ) 
                carry += A[i]; 
            
            ans.add(carry % 10);
            carry = carry / 10; 
        }
        
        Collections.reverse(ans);
        
        return ans;
    }
}