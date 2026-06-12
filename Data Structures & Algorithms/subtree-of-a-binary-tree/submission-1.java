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
    public boolean isSameTree(TreeNode p, TreeNode q){
        if(p == null && q != null)return false;
        else if(p != null && q == null)return false;
        else if (p == null && q == null)return true;

        boolean l = isSameTree(p.left, q.left);
        boolean r = isSameTree(p.right, q.right);
        if(q.val != p.val)return false;
        return l && r;
    }
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(subRoot == null)return true;
        if(root == null)return false;

        if(isSameTree(root, subRoot))return true;

        boolean l = isSubtree(root.left, subRoot);
        boolean r = isSubtree(root.right, subRoot);

        return l || r;
    }
}
