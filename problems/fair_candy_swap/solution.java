class Solution {
    public int[] fairCandySwap(int[] A, int[] B) {
        int[] trade = new int[2];
        
        int sa = 0, sb = 0;
        Set<Integer> setA = new HashSet<>();
        
        for (int a: A) { sa += a; setA.add(a); }
        for (int b: B) sb += b;
        
        for (int tb: B) {
            int ta = (sa - sb + 2*tb) / 2;
                
            if(setA.contains(ta)) {
                trade[0] = ta;
                trade[1] = tb;
                return trade;
            }
        }
        
        return trade;
    }
    
}