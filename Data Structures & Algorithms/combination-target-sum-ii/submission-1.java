class Solution {
    public List<List<Integer>>res = new ArrayList<>();
    public void backtrack(int i, int [] nums, int sum, int target, List<Integer> set){
        if(sum == target){
            List<Integer> setCopy = new ArrayList<>(set);
            res.add(setCopy);
            return;
        }
        if(i == nums.length){
            return;
        }
        set.add(nums[i]);
        sum+=nums[i];
        backtrack(i+1, nums,sum,target,set);
        set.remove(set.size()-1);
        sum-=nums[i];
        while(i+1 < nums.length && nums[i] == nums[i+1])i++;
        backtrack(i+1, nums,sum,target,set);
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<Integer> set = new ArrayList<>();
        backtrack(0, candidates, 0, target, set);
        return res;
    }
}
