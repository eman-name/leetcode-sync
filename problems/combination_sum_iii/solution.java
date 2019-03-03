class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        
        List<List<Integer>> solution = new ArrayList<>();
        build(k,n,1, solution, new LinkedList<Integer>());
        return solution;      
    }
    
    private void build(int k, int target, int index, List<List<Integer>> solution, List<Integer> list) {
        
        if(target<0) { // missed the target
            return; 
        } else if (target==0 && list.size() == k) { // hit the target
            solution.add(new LinkedList<>(list));
        }
        
        for(int i=index; i<10; i++) {
            if (list.size() < k) {
                list.add(i); // add current index
                build(k,target-i,i+1,solution,list); // add all sub-solutions based on this index
                list.remove(list.size() - 1); // clean-up and try next index
            }
        }
        
    }
    
    
}