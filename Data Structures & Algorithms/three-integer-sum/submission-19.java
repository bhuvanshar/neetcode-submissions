class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(i>0 && nums[i-1] == nums[i])continue;

            int l = i+1;
            int r = nums.length-1;
            while(l<r){
                if(nums[l] + nums[r] + nums[i] < 0){
                    l++;
                }else if(nums[l] + nums[r] + nums[i] > 0){
                    r--;
                }else{
                    res.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    l++;
                    r--;
                    while(l < r && nums[l-1] == nums[l])l++;
                }
            }
        }
        return res;
    }
}
