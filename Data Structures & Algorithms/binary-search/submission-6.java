class Solution {
    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length-1;
        int mid = -1;
        while(l <= r){
            mid = (l + r +1)/2;
            if(nums[mid] < target){
               l = mid+1; 
            }else if(nums[mid] > target){
                
                r = mid-1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}
