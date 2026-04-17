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
        if(root == null)
            return new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        List<List<Integer>>result = new ArrayList<>();
        List<Integer>rightSideView = new ArrayList<>();
        List<Integer> tempRes = new ArrayList<>();
        while(q.size()>1){
            TreeNode temp = q.poll();
            if(temp!=null)
                tempRes.add(temp.val);
            else{
                result.add(tempRes);
                rightSideView.add(tempRes.get(tempRes.size()-1));
                tempRes = new ArrayList<>();
                q.add(null);
                continue;
            }
            if(temp.left!=null){
                q.add(temp.left);
            }
            if(temp.right!=null){
                q.add(temp.right);
            }
        }
        result.add(tempRes);
        rightSideView.add(tempRes.get(tempRes.size()-1));
        // List<Integer>rightSideView = new ArrayList<>();
        // for(int i=0;i<tempRes.size();i++){
        //     rightSideView.add(result.get(i).get(result.get(i).size()-1));
        // }
        return rightSideView;
    }
}
