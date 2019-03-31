/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    
    /**
     * runtime complexity: O(N^2)
     */
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        
        
        List<TreeNode> ret = new ArrayList<TreeNode>();
        
        if(root == null) return ret;
        
        List<TreeNode> t = dfs(root); // inorder dfs listing of all nodes; O(N)
        
        Set<String> serials =  new HashSet<String>();
        Map<String, TreeNode> nodes =  new HashMap<String, TreeNode>();
        Map<String, Integer> occurences =  new HashMap<String, Integer>(); 
        
        for(TreeNode node: t) { // O(N)
            
            String id = serialize(node); // O(N)
            System.out.println(id);
            
            // collect set of ids for each unique subtrees O(1)
            serials.add(id);  // O(1)
            
            // collect map of roots for each unique subtrees O(1)
            nodes.put(id, node);  
            
            // track the occurences of each unique subtree
            if(occurences.get(id) != null) 
                occurences.put(id, occurences.get(id)+1); // O(1)
            else 
                occurences.put(id, 1);
            
            // track list of all subtree with more than one occurence (duplicates) 
            if(occurences.get(id) == 2) ret.add(nodes.get(id)); // O1()
        }
         
        return ret;
    }
    
    /**
     * runtime complexity: O(|V+E|) = O(N);
     */
    private List<TreeNode> dfs(TreeNode root) {
        List<TreeNode> ans = new ArrayList<TreeNode>();
        Deque<TreeNode> stack = new ArrayDeque<TreeNode>();
        
        stack.push(root);
        
        while(!stack.isEmpty()){
            TreeNode n = stack.pop();
            ans.add(n);
            if(n.left != null) stack.push(n.left);
            if(n.right != null) stack.push(n.right);
        }
        return ans;
    }
    
    /**
     * runtime complexity: O(|V+E|) = O(N);
     */
    private String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        Deque<TreeNode> stack = new ArrayDeque<TreeNode>();
        
        stack.push(root);
        
        while(!stack.isEmpty()){
            TreeNode n = stack.pop();
            sb.append(n.val + ", ");
            
            if(n.left != null) stack.push(n.left);
            else sb.append("r-null, ");
            
            if(n.right != null) stack.push(n.right);
            else sb.append("l-null, ");
        }
        
        return sb.toString();
    }
    
}