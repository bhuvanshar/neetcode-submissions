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

public int dfs(TreeNode root, int max){
                if(root == null){
                        return 0;
                }
                int good = root.val >= max ? 1:0;
                int newMax = Math.max(max, root.val);
                return good + dfs(root.left, newMax) + dfs(root.right,newMax);
        }

    public int goodNodes(TreeNode root) {
        return dfs(root, Integer.MIN_VALUE);
    }
}
