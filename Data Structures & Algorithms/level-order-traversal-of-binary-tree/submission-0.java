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
    
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        if(root == null){
            return new ArrayList<>();
        }
        q.add(root); q.add(null);
        List<List<Integer>> result = new ArrayList<>();
        List<Integer>tempArray = new ArrayList<>();
        // tempArray.add(root.val);
        while(q.size()>1){
            TreeNode temp = q.poll();
            if(temp != null)
                tempArray.add(temp.val);
            if(temp == null){
                result.add(tempArray);
                tempArray = new ArrayList<>();
                System.out.println("\n");
                q.add(null);
                continue;
            }

            System.out.println(temp.val);

            if(temp.left != null){
                q.add(temp.left);
            }
            if(temp.right != null){
                q.add(temp.right);
            }
        }
        result.add(tempArray);
        return result;
    }
}
