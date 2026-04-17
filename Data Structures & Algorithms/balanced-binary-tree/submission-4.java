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
    int h(TreeNode root){
        if(root == null){
            return 0;
        }
        return Math.max(h(root.left), h(root.right)) + 1;
    }
    public boolean isBalanced(TreeNode root) {
        if(root == null){
            return true;
        }

        boolean l = isBalanced(root.left);
        boolean r = isBalanced(root.right);

        if(Math.abs(h(root.left) - h(root.right)) > 1){
            return false;
        }
        return l&&r;
    }
}
