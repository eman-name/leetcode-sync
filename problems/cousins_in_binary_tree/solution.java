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
    Map<Integer, Integer> depth;
    Map<Integer, TreeNode> parent;
    
    public boolean isCousins(TreeNode root, int x, int y) {
        depth = new HashMap();
        parent = new HashMap();
        
        dfs(root);
        return (depth.get(x) == depth.get(y) && parent.get(x) != parent.get(y));
    }
    
    private void dfs(TreeNode root) {
        
        Deque<TreeNode> q = new ArrayDeque <>();
        
        q.add(root);
        depth.put(root.val, 0);
        
        while(!q.isEmpty()){
            TreeNode t = (TreeNode) q.remove();
            
            if (t.left != null) {
                q.add(t.left);
                parent.put(t.left.val, t);
                depth.put(t.left.val, depth.get(t.val) + 1);
            }
			if (t.right != null) {
                q.add(t.right);
                parent.put(t.right.val, t);
                depth.put(t.right.val, depth.get(t.val)+1);
            }
        }
       
    }
}