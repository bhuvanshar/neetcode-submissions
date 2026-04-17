class Solution {
    public int [] binarySearch(int [] arr, int left, int right, int target){
        int l = left;
        int r = right;
        while(l <= r){
            int mid = l+(r-l)/2;
            if(arr[mid] < target){
                l = mid+1;
            }else if(arr[mid] > target){
                r = mid-1;
            }else{
                return new int[]{mid, 1};
            }
        }
        return new int []{-1,-1};
    }
    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length-1;
        while(l<r){
            int mid = l+(r-l)/2;
            if(nums[mid] > nums[r]){
                l = mid+1;
            }else{
                r = mid;
            }
        }
        int cut = l-1;
        int [] leftSearchSpace = binarySearch(nums, 0, cut, target);
        int [] rightSearchSpace = binarySearch(nums, cut+1, nums.length-1, target);

        if(leftSearchSpace[1] == 1){
            return leftSearchSpace[0];
        }else if(rightSearchSpace[1] == 1){
            return rightSearchSpace[0];
        }else{
            return -1;
        }
    }
}
