class Solution {
    public int countPrimes(int n) {
        int ans = 0;
        boolean[] checked = new boolean [n];
        
        for(int i = 2; i < n; i++) {
            
            if(checked[i]) continue;
            
            if(isPrime(i)) ans++;
            
            for(int j = 2*i; j < n; j+=i)
                if(j%i == 0) checked[j] = true;
        } 
        
        return ans;
    }
    
    private boolean isPrime(int  n) {
        if(n==2) return true;
        else if (n%2 == 0) return false;
        else for(int i = 2; i*i < n; i++) 
            if(n % i == 0) return false;

        return true;
    }
}