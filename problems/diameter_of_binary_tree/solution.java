/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    
    int diameter;
    
    public int diameterOfBinaryTree(TreeNode root) {
        diameter = 1;
        getDepth(root);
        return diameter - 1;
    }
    
    private int getDepth(TreeNode node) {
        if(node == null) return 0;
        int l = getDepth(node.left);
        int r = getDepth(node.right);
        diameter = Math.max(diameter, l + r + 1); 
        return Math.max(l, r) + 1;
    }
}