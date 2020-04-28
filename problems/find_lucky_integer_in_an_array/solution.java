class Solution {
    public int findLucky(int[] arr) {
        
        Map<Integer, Integer> lucky = new HashMap<>();
        int largestLucky = -1;
        
        for(int num: arr) {
            if(lucky.containsKey(num)) lucky.put(num, lucky.get(num)+1);
            else lucky.put(num, 1);
        }
        
        for(Map.Entry<Integer, Integer> entry : lucky.entrySet()){
            if(entry.getKey() == entry.getValue()  && entry.getKey() >  largestLucky ) largestLucky = entry.getKey();
        }
        
        return largestLucky;
    }
}