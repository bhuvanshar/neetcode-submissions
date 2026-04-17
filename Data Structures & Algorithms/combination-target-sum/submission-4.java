class Solution {
    List<List<Integer>> result = new ArrayList<>();

    public void backtrack(int [] nums, int i, int sum, int target, List<Integer> set){
        if(sum == target){
            List<Integer> setCopy = new ArrayList<>(set);
            result.add(setCopy);
            return;
        }
        if(i > nums.length-1){
            return;
        }
        if(target-sum < 0){
            return;
        }
        set.add(nums[i]);
        backtrack(nums, i, sum+nums[i], target, set);
        set.remove(set.size()-1);
        backtrack(nums, i+1, sum, target, set);
    }

    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<Integer> set = new ArrayList<>();
        backtrack(nums, 0, 0, target, set);
        return result;
    }
}
