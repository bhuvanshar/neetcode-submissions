class Solution {
    List<List<Integer>> result;
    public Solution(){
        this.result = new ArrayList<>();
    }
    public void generateSubsets(int i, int[] nums, List<Integer> sets){
        if(i >= nums.length){
            List<Integer> setCopy = new ArrayList<>(sets);
            result.add(setCopy);
            return;
        }

        sets.add(nums[i]);
        generateSubsets(i+1, nums, sets);
        sets.remove(sets.size()-1);
        generateSubsets(i+1, nums, sets);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> sets = new ArrayList<>();
        generateSubsets(0,nums,sets);
        return result;
    }
}
