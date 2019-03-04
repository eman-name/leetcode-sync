/*
// Employee info
class Employee {
    // It's the unique id of each node;
    // unique id of this employee
    public int id;
    // the importance value of this employee
    public int importance;
    // the id of direct subordinates
    public List<Integer> subordinates;
};
*/
class Solution {
    
    Map<Integer, Employee> m;
    
    public int getImportance(List<Employee> employees, int id) {
        m = new HashMap<Integer, Employee>();
        for(Employee e: employees) m.put(e.id, e);
        return dfs(id);
    }
    
    public int dfs(int id){
        int ret = m.get(id).importance;
        for(Integer i: m.get(id).subordinates) ret += dfs(i);
        return ret;
    }
}