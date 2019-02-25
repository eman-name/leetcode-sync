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
     * Search BST TreeNode for two elements with sum equivalent to k
     */ 
    public boolean findTarget(TreeNode root, int k) {
        Set<Integer> set = new HashSet<Integer>();
        return find(root,set,k);
    }
    
    /**
     * Search BST TreeNode for element with value equivalent to target t
     * returns true if this binaryTree contains target value
     */
    private boolean find(TreeNode root, Set<Integer> set, int k) {
        if(root == null) return false;
        if(set.contains(k - root.val)) return true;
        set.add(root.val);
        return find(root.left, set, k) || find(root.right, set, k);
    }
    
    
}