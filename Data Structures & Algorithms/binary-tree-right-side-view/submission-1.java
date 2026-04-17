/**
 * Definition for a binary tree TreeNode.
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
    public List<Integer> rightSideView(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        List<List<Integer>> result = new ArrayList<>();
        List<Integer>rightView = new ArrayList<>();
        List<Integer> tempList = new ArrayList<>();
        while (q.size() > 1) {
            TreeNode temp = q.poll();

            if (temp == null) {
                result.add(tempList);
                rightView.add(tempList.get(tempList.size()-1));
                tempList = new ArrayList<>();
                q.add(null);
                continue;
            }
            tempList.add(temp.val);
            if (temp.left != null) {
                q.add(temp.left);
            }
            if (temp.right != null) {
                q.add(temp.right);
            }
        }
        result.add(tempList);
        rightView.add(tempList.get(tempList.size()-1));
        return rightView;
    }
}
