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
        public boolean first;
        public int second;
        public Pair(boolean first, int second){
            this.first = first;
            this.second = second;
        }
    }
    Pair dfs(TreeNode root){
        if(root == null){
            return new Pair(true, 0);
        }
        Pair left = dfs(root.left);
        Pair right = dfs(root.right);
        boolean isBalanced = left.first && right.first && Math.abs(left.second - right.second) <= 1;

        return new Pair(isBalanced, Math.max(right.second, left.second) + 1);
    }
    public boolean isBalanced(TreeNode root) {
        Pair ans = dfs(root);
        return ans.first;
    }
}
