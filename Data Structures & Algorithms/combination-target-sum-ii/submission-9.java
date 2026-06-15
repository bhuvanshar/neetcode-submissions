class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<Integer> t = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(candidates);
        solve(candidates, target, 0, t, res);
        return res;
    }

    public void solve(int [] n, int tar, int i, List<Integer>t, List<List<Integer>>res){
        if(tar == 0){
            res.add(new ArrayList<>(t));
            return;
        }
        if(i >= n.length || tar < 0){
            return;
        }

        t.add(n[i]);
        solve(n, tar-n[i], i+1, t, res);
        t.remove(t.size()-1);
        while(i+1 < n.length && n[i+1] == n[i])i++;
        solve(n, tar, i+1, t, res);
    }
}
