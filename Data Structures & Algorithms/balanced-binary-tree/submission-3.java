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
    private boolean isBananced = true;
    public int height(TreeNode root){
        if(root == null){
            return 0;
        }

        int l = height(root.left);
        int r = height(root.right);
        if(Math.abs(r-l) > 1){
            isBananced = false;
        }
        return Math.max(l,r)+1;
    }
    public boolean isBalanced(TreeNode root) {
        int h = height(root);
        return isBananced;
    }
}
