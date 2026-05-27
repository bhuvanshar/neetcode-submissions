class Solution {
    public int rob(int[] nums) {
        int [] dp = new int [nums.length];
        Arrays.fill(dp, -1);
        // return recursive(nums);
        return mem(nums, nums.length-1, dp);
    }
    public int recursive(int [] nums){
        int n = nums.length;
        return solve(nums, n-1);
    }
    public int solve(int [] nums, int n){
        if(n < 0)return 0;
        if(n == 0)return nums[0];

        return Math.max(solve(nums, n-1), solve(nums, n-2) + nums[n]);
    }

    public int mem(int [] nums, int i, int [] dp){
        if(i == 0)return nums[0];
        if(i < 0)return 0;
        if(dp[i] != -1)return dp[i];
        dp[i] = Math.max(mem(nums, i-1, dp), mem(nums, i-2, dp) + nums[i]);
        return dp[i];
    }
}
