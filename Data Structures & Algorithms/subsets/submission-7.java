class Solution {
    List<List<Integer>> result = new ArrayList<>();
    
    public void backtrack(int [] nums, int i, List<Integer> set){
        if(i > nums.length-1){
            List<Integer> setCopy = new ArrayList<>(set);
            result.add(setCopy);
            return;
        }
        set.add(nums[i]);
        backtrack(nums, i+1, set);
        set.remove(set.size()-1);
        backtrack(nums, i+1, set);
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<Integer>set = new ArrayList<>();
        backtrack(nums, 0, set);
        return result;
    }
}
