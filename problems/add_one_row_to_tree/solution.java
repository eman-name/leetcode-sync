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
    public TreeNode addOneRow(TreeNode root, int v, int d) {
        if(d == 1) {
            TreeNode tmp = root;
            root = new TreeNode(v);
            root.left = tmp;
        }
        
        else if(d > 1) {
            Set<TreeNode> S = getNodesAtDepth(root, d-1);
            
            for(TreeNode n : S) {
                TreeNode tmp = n.left;
                TreeNode l = new TreeNode(v);
                l.left = tmp;
                n.left = l;

                tmp = n.right;
                TreeNode r = new TreeNode(v);
                r.right = tmp;
                n.right = r;
            }
        }
        
        return root;
    }
    
    /**
     * returns all the nodes at depth d
     */
    private Set<TreeNode> getNodesAtDepth(TreeNode root, int d) {
        Deque<TreeNode> q = new ArrayDeque();
        Map<TreeNode, Integer> m = new HashMap();
        Set<TreeNode> s = new HashSet();

        q.offer(root);
        m.put(root, 1);
        if(d==1) s.add(root);
            
        while(!q.isEmpty()){
            
            TreeNode n = q.poll();
            int depth = m.get(n);
            if(d==depth) s.add(n);
            
            if(n.left != null) {
                q.offer(n.left);
                m.put(n.left, depth+1);
            }
                
            if(n.right != null) {
                q.offer(n.right);
                m.put(n.right, depth+1);
            }
        }
        
        return s;
    }
}