class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit = 0;
        
        for(int i = 0; i<prices.length-1; i++) {
            if(prices[i+1] > prices[i]) maxprofit 
                += prices[i+1] - prices[i];
        }
        
        return maxprofit;
        
    }
}