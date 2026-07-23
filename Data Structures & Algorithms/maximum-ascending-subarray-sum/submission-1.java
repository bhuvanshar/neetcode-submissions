class Solution {
    public int maxAscendingSum(int[] nums) {
        int maxSum = nums[0];
        int sum = 0;
        int x = nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i] == x){
                // maxSum = nums[i];
                sum = nums[i];
                continue;
            }else if(x < nums[i]){
                sum+=nums[i];
                x = nums[i];
                maxSum = Math.max(maxSum, sum);
            }else{
                sum = nums[i];
                x = nums[i];
                maxSum = Math.max(maxSum, sum);
            }
        }
        return maxSum;
    }
}