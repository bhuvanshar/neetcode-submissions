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
    boolean ans = true;
    public int height(TreeNode root){
        if(root == null)return 0;
        int l = height(root.left);
        int r = height(root.right);
        if(Math.abs(l-r) <= 1){
            ans = ans && true;
        }else{
            ans = ans && false;
        }
        return Math.max(l,r) + 1;
    }
    public boolean isBalanced(TreeNode root) {
        if(root == null)return true;
        int h = height(root);
        return ans;
    }
}
