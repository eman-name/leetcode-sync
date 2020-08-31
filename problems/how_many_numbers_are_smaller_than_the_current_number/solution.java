class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        
        int[] count = new int [nums.length];
        
        // O((n*(n-1))/2) - pairwise count
        for(int i = 0; i < nums.length-1; i++) {
          for(int j = i+1; j < nums.length; j++) {  
              if(nums[i] > nums[j]) count[i]++;
              else if(nums[j] > nums[i]) count[j]++;
          }   
        }
        
        return count;
        
    }
}