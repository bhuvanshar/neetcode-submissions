class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int x = nums[0];

        int small = 0;
        int large = 0;
        int max = 1;
        for(int i=0;i<nums.length;i++){
            if(x == nums[i]){
                small = 1;
                large = 1;
                continue;
            }else if(x < nums[i]){
                large++;
                x = nums[i];
                max = Math.max(max, large);
                small = 1;
            }else if (x > nums[i]){
                small++;
                large = 1;
                x = nums[i];
                max = Math.max(max, small);
            }
        }
        return max;
    }
}