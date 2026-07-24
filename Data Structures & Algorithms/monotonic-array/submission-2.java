class Solution {
    public boolean isMonotonic(int[] nums) {
        int idx = 0;
        for(int i=1;i<nums.length;i++){
            if(nums[i] == nums[i-1]){
                idx = i;
            }else{
                break;
            }
        }
        if(idx < nums.length-1 && nums[idx] < nums[idx+1]){
            for(int i=idx+1;i<nums.length;i++){
                if(nums[i] >= nums[i-1])continue;
                else return false;
            }
        }else if(idx < nums.length-1 && nums[idx] > nums[idx+1]){
            for(int i=idx+1; i<nums.length;i++){
                if(nums[i] <= nums[i-1])continue;
                else return false;
            }
        }
        return true;
    }
}