class Solution {
    public int findMin(int[] nums) {
        int l =0, r = nums.length-1;
        int max = Integer.MAX_VALUE;
        while(l<=r){
            int m = (l+r)/2;
            if(max > nums[m]){
                max = nums[m];
            }
            if(nums[m]<nums[r]){
                r= m-1;
            }
            else{
                l = m+1;
            }
        }
        return max;
    }
}
