class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for(int j = 0;j < nums.length;j++){
            if(j>0&&nums[j-1] == nums[j])continue;

            int l = j+1;
            int r = nums.length-1;
            while(l < r){
                int target = nums[l] + nums[r] + nums[j];
                if(target<0){
                    l++;
                }else if(target>0){
                    r--;
                }else{
                    res.add(Arrays.asList(nums[l],nums[j],nums[r]));
                    l++;
                    r--;
                    while(l<r && nums[l-1] == nums[l])l++;
                }
            }
        }
        return res;
    }
}
