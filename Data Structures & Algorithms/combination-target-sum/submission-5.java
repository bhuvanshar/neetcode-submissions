class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<Integer>t = new ArrayList<>();
        List<List<Integer>>res = new ArrayList<>();
        backtracking(nums, target, 0, t, res);
        return res;
    }

    public void backtracking(int [] n, int target, int i, List<Integer>t, List<List<Integer>>res){
        if(i == n.length || target<0){
            return;
        }
        if(target == 0){
            res.add(new ArrayList<>(t));
            return;
        }
        t.add(n[i]);
        backtracking(n, target-n[i], i, t, res);
        t.remove(t.size()-1);
        backtracking(n, target,i+1,t,res);
    }
}
