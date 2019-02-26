class Solution {
    public boolean isLongPressedName(String name, String typed) {
        
        if(name.equals(typed)) return true;
        
        char[] n = name.toCharArray();
        char[] t = typed.toCharArray();
        
        List<Integer> iN = new ArrayList<Integer>();
        List<Character> cN = new ArrayList<Character>();
        
        List<Integer> iT = new ArrayList<Integer>();
        List<Character> cT = new ArrayList<Character>();
        
        groupify(n, iN, cN);
        groupify(t, iT, cT);
        
        // are the name and type groups consistent with long presses
        if(iN.size() != iT.size()) return false;
        for(int i=1; i<iN.size(); i++){ 
            if(iN.get(i) > iT.get(i) || cN.get(i) != cT.get(i)) 
                return false;
        }
        
        return true;
        
    }
    
    private void groupify(char[] n, List<Integer> i, List<Character> c) {
        int count = 1;
        
        for(int j=1; j<n.length; j++) { 
            if(n[j] == n[j-1]) { // repeating letter found 
                count++;
            } else { // border found
                
                // store group and reset counter
                i.add(count);
                c.add(n[j-1]);
                count = 1;
            }
        }
        // store last group 
        i.add(count); 
        c.add(n[n.length-1]);
    }
    
}