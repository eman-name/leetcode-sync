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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        
        String s1 = dfs(p);
        String s2 = dfs(q);
        
        System.out.println(s1);
        System.out.println(s2);
        
        return s1.equals(s2);
        
    }
    
    private String dfs(TreeNode r){
        Deque<TreeNode> s = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();
        
        if(r == null) return "";
        
        s.push(r);
        
        while(!s.isEmpty()) {
            TreeNode n = s.pop();
            
            sb.append(n.val + " ");
            
            if(n.right != null) s.push(n.right);
            else sb.append("r-null ");
                
            if(n.left != null) s.push(n.left);
            else sb.append("l-null ");
        }
        
        return sb.toString();
    }
       
}