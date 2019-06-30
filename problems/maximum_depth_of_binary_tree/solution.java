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
    public int maxDepth(TreeNode root) {
        return dfs(root);
    }
    
    private int dfs(TreeNode n){
        if(n == null) return 0;
        Deque<TreeNode> s = new ArrayDeque<>();
        Map<TreeNode, Integer> m = new HashMap<>();
        
        int d = 1;
        m.put(n, d);
        s.push(n);
            
        while(!s.isEmpty()) {
            
            n = s.pop();
            
            if(m.get(n) > d) 
                d = m.get(n);
            
            if(n.right != null) {
                s.push(n.right);
                m.put(n.right, m.get(n)+1);
            }
            if(n.left != null) {
                s.push(n.left);
                m.put(n.left, m.get(n)+1);
            }
        }
        
        return d;
        
    }
    
    
}