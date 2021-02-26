class Solution {
    public int[] minOperations(String boxes) {        
        char[] set = new char[boxes.length()];
        set = boxes.toCharArray();
        
        int[] result = new int[boxes.length()];

        for(int i = 0; i < boxes.length(); i++)  {
            for(int j = 0; j < boxes.length(); j++)  {
                if(set[j] == '1') result[i] += Math.abs(i-j);
            }
        }  
        
        return result;
    }
}