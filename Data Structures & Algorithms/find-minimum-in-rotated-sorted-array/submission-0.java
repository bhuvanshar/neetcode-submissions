class Solution {
    // special binary search
    public int findMin(int[] nums) {

        int res = nums[0];
        int l = 0;
        int r = nums.length-1;

        while(l <= r){
            if(nums[l] < nums[r]){
                res = Math.min(res, nums[l]);
                break;
            }

            int mid = l + (r-l)/2;
            res = Math.min(nums[mid], res);
            if(nums[mid] <= nums[r]){
                r = mid-1;
            }else{
                l = mid + 1;
            }
        }
    return res;
    }
}
