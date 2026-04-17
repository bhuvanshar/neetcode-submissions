class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>result = new ArrayList<>();

        for(int i=0;i<Math.pow(2,nums.length); i++){
            List<Integer>temp = new ArrayList<>();
            for(int x = 0; x<nums.length;x++){
                if((i&(1<<x)) != 0){
                    temp.add(nums[x]);
                }
            }
            result.add(temp);
        }
        return result;
    }
}
