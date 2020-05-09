//import java.util.*;

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
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        return traverse(original, cloned, target);
    }
    
    private TreeNode traverse(TreeNode n1, TreeNode n2, TreeNode n3){
        
        Deque<TreeNode> t1 = new ArrayDeque<>();
        Deque<TreeNode> t2 = new ArrayDeque<>();
        
        t1.push(n1);
        t2.push(n2);
        
        while(!t1.isEmpty()) {
            
            TreeNode c1 = t1.pop();
            TreeNode c2 = t2.pop();
            
            if(c1.val == n3.val) return c2;
            
            if(c1.left != null) {
                t1.push(c1.left);
                t2.push(c2.left);
            }
            if(c1.right != null) {
                t1.push(c1.right);
                t2.push(c2.right);
            }
        }
        
        return null;
    }
}