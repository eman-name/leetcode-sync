class Solution {
    public boolean isHappy(int n) {
        int sum = 0;
        Set<Integer> seen = new HashSet<>();
        
        while(true){
            
            sum += (int) Math.pow(n%10, 2);   // square one's place
            n = n/10;                   // shift number
            
            if(n == 0 && sum == 1) 
                break;
            else if (n == 0 && seen.contains(sum)) 
                return false;
            else if(n == 0) {
                n = sum;    // begin next iteration
                sum = 0;    // reset sum
                seen.add(n);
                System.out.println("next:" + n);
            }
            
            
        }
        
        return true;
            
    }
}