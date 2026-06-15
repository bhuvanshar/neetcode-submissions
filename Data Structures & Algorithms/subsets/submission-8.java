class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer>t = new ArrayList<>();
        List<List<Integer>>res = new ArrayList<>();
        backtracking(nums, 0, t, res);
        return res;
    }

    public void backtracking(int [] n, int i, List<Integer>t, List<List<Integer>>res){
        if(i >= n.length){
            res.add(new ArrayList<>(t));
            return;
        }
        t.add(n[i]);
        backtracking(n, i+1, t, res);
        t.remove(t.size()-1);
        backtracking(n, i+1, t, res);
    }
}
