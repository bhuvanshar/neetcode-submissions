class Solution {
    public List<List<Integer>>result = new ArrayList<>();
    public void backtrack(int i, int sum, int [] nums, List<Integer>set, int target){
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
        backtrack(i, sum+nums[i], nums, set, target);
        set.remove(set.size()-1);
        backtrack(i+1, sum, nums, set, target);
    }
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<Integer>set = new ArrayList<>();
        backtrack(0,0,nums,set,target);
        return result;
    }
}
