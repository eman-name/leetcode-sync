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
    public int rangeSumBST(TreeNode root, int L, int R) {        
        return dst(root, L, R);
        
    }
    
    private int dst(TreeNode n, int l, int r) {
        Deque<TreeNode> stack = new ArrayDeque<>();
        int count = 0;
        
        if(n == null) return count;
        stack.push(n);
        
        while(!stack.isEmpty()){
            
            n = stack.pop();
            if(n.val >= l && n.val <= r ) count += n.val;
            
            if(n.right != null) stack.push(n.right);
            if(n.left != null) stack.push(n.left);
        }
        
        return count;
    }
    
}