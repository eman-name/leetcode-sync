class RandomizedSet {
    
    private Random r = new Random();
    private Map<Integer, Integer> m;
    private List<Integer> l;

    /** Initialize your data structure here. */
    public RandomizedSet() {
        m = new HashMap<Integer, Integer>();
        l = new ArrayList<Integer>();
    }
    
    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        if(!m.containsKey(val)) {
            m.put(val, l.size());
            l.add(val);
            return true;
        }
        
        return false;
    }
    
    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        if(m.containsKey(val)) {
            
            int index = m.get(val);
            
            if(index < l.size()-1) {
                int last = l.get(l.size()-1);
                l.set(index, last);
                m.put(last, index);
            }
            
            l.remove(l.size()-1);
            m.remove(val);
            
            return true;
        }
           
        return false;
    }
    
    /** Get a random element from the set. */
    public int getRandom() {
        return l.get(r.nextInt(l.size()));
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */