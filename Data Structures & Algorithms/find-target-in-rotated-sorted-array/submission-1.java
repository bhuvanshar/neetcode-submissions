class Solution {

    public int binarySearch(int [] nums, int start, int end, int target){
        int l = start;
        int r = end;
        while(l <= r){
            int mid = l + (r-l)/2;
            if(nums[mid] < target){
                l = mid+1;
            }else if(nums[mid] > target){
                r = mid-1;
            }else{
                return mid;
            }
        }
        return -1;
    }

    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length-1;
        int pivot = 0;
        int res = nums[0];

        while(l <= r){
            if(nums[l] < nums[r]){
                res = Math.min(res, nums[l]);
                pivot = l;
                break;
            }

            int mid = l + (r-l)/2;
            res = Math.min(res, nums[mid]);
            if(res == nums[mid]){
                pivot = mid;
            }
            if(nums[mid] <= nums[r]){
                r = mid-1;
            }else{
                l = mid+1;
            }
        }

        return binarySearch(nums, 0, pivot-1, target) != -1 ? binarySearch(nums, 0, pivot-1, target) : binarySearch(nums, pivot, nums.length-1, target);
    }
}
