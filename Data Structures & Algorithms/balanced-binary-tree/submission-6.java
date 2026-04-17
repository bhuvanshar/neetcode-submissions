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
    class Pair{
        boolean balanced;
        int height;
        public Pair(boolean balanced, int height){
            this.balanced = balanced;
            this.height = height;
        }
    }
    public Pair h(TreeNode root){
        if(root == null){
            return new Pair(true, 0);
        }

        Pair l = h(root.left);
        Pair r = h(root.right);
        boolean isBalanced = l.balanced && r.balanced && Math.abs(l.height-r.height) <= 1;
        return new Pair(isBalanced, Math.max(l.height, r.height) + 1);

    }
    public boolean isBalanced(TreeNode root) {
        Pair ans = h(root);
        return ans.balanced;
    }
}
