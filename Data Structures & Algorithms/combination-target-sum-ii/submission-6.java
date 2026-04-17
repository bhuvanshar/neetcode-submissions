class Solution {
    List<List<Integer>>result = new ArrayList<>();
        public void backtrack2(int i, int [] nums, int sum, int target, List<Integer>set){

        if(sum == target){
            List<Integer>setCopy = new ArrayList<>(set);
            result.add(setCopy);
            return;
        }
        if(sum > target || i > nums.length-1){
            return;
        }
        set.add(nums[i]);
        backtrack2(i+1, nums,sum+nums[i],target, set);
        set.remove(set.size()-1);
        while(i+1 < nums.length && nums[i] == nums[i+1])i++;
        backtrack2(i+1, nums, sum, target,set);
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<Integer> set = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack2(0,candidates, 0, target, set);
        return result;
    }
}
