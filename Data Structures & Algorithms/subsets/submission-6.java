class Solution {
    public List<List<Integer>>result = new ArrayList<>();
    public void backtrack(int i, int [] nums, List<Integer>set){

        if(i > nums.length-1){
            List<Integer> setCopy = new ArrayList<>(set);
            result.add(setCopy);
            return;
        }

        set.add(nums[i]);
        backtrack(i+1, nums, set);

        set.remove(set.size()-1);
        backtrack(i+1, nums,set);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer>set = new ArrayList<>();
        backtrack(0,nums,set);
        return result;
    }
}
