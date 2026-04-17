class Solution {
    int binarySearch(int [] arr, int target, int left, int right){
        int l = left;
        int r = right;
        while(l <= r){
            int mid = l + (r-l)/2;
            if(arr[mid] < target){
                l = mid+1;
            }else if(arr[mid] > target){
                r = mid-1;
            }else{
                return mid;
            }
        }
        return Integer.MIN_VALUE;
    }
    public int search(int[] nums, int target) {
        int idx = 0;
        for(int i=1;i<nums.length;i++){
            if(nums[i] < nums[i-1]){
                idx = i;
                break;
            }
        }
        int x = binarySearch(nums, target, 0, idx-1);
        int y = binarySearch(nums, target, idx, nums.length-1);

        if(x != Integer.MIN_VALUE || y != Integer.MIN_VALUE){
            if(x != Integer.MIN_VALUE){
                return x;
            }else{
                return y;
            }
        }else{
            return -1;
        }
    }
}
