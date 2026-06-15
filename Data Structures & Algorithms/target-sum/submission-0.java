class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int totalSum = 0;
        for(int n : nums){
            totalSum+=n;
        }
        //total can be negatice so -n to n we have considered meaning 2*n+1;
        int [][] dp = new int [nums.length][2*totalSum+1];
        for(int i = 0;i<nums.length;i++){
            for(int j=0;j<2*totalSum + 1; j++){
                dp[i][j] = Integer.MIN_VALUE;
            }
        }
        return memo(nums, target, 0, 0, dp, totalSum);
    }

    public int solve(int [] nums, int i, int target, int total){
        if(i == nums.length){
            return target == total ? 1 : 0;
        }

        return solve(nums, i+1, target, total + nums[i]) + solve(nums, i+1, target, total-nums[i]);
    }
    public int memo(int [] nums, int target, int total, int i, int [][] memo, int totalSum){
        if(i == nums.length){
            return total == target ? 1 : 0;
        }
        if(memo[i][total + totalSum] != Integer.MIN_VALUE)return memo[i][total + totalSum];

        return memo[i][total + totalSum] = memo(nums, target, total + nums[i], i+1, memo, totalSum)+
                                            memo(nums, target, total-nums[i], i+1, memo, totalSum);
    }
}
