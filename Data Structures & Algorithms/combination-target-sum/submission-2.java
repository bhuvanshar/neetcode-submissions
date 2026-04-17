class Solution {

    List<List<Integer>> result = new ArrayList<>();

    public void backtrack(int i, int [] nums, int sum, int target, List<Integer>set){

        if(sum == target){
            List<Integer>setCopy = new ArrayList<>(set);
            result.add(setCopy);
            return;
        }

        if(target-sum < 0 || i > nums.length-1){
            return;
        }
        set.add(nums[i]);
        backtrack(i, nums, sum+nums[i], target, set);
        set.remove(set.size()-1);
        backtrack(i+1, nums, sum, target, set);
    }

    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<Integer> set = new ArrayList<>();
        backtrack(0, nums, 0, target, set);
        return result;
    }
}
