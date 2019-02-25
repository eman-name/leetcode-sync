import java.util.*;

class Solution {
    
    public String countAndSay(int n) {
        if (n < 1 || n > 30) throw new IllegalArgumentException("1 ≤ n ≤ 30");
        return say(n);
    }
    
    public String say (int n) {
        StringBuilder toSay = new StringBuilder();
        
        if(n==1) return "1";
        
        char[] prevToSay = say(n-1).toCharArray();
        
        int count = 1;
        char prev = prevToSay[0];
        
        for(int i = 1; i < prevToSay.length; i++) {
            if(prev == prevToSay[i]){
                count++;
            } else {
                toSay.append(count).append(prev);
                prev = prevToSay[i];
                count = 1;
            }
        }
        toSay.append(count).append(prev);
        
        
        return toSay.toString();
    }
    
    
    
}