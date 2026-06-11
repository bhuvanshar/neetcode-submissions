class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int [] memo = new int [n+1];
        Arrays.fill(memo,-1);
        // return memoSolve(nums, n-1, memo);
        // return solve(nums, n-1);
        return tabulation(nums);
    }

    public int memoSolve(int [] nums, int i, int [] memo){
        if(i == 0)return nums[0];
        if(i < 0)return 0;
        if(memo[i] != -1)return memo[i];

        return memo[i] = Math.max(memoSolve(nums, i-1, memo), memoSolve(nums, i-2, memo) + nums[i]);
    }

    public int tabulation(int [] nums){
        if(nums.length == 0)return 0;
        if(nums.length == 1)return nums[0];
        int [] dp = new int [nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(dp[0], nums[1]);

        for(int i=2;i<nums.length;i++){
            dp[i] = Math.max(dp[i-1], nums[i] + dp[i-2]);
        }
        return dp[nums.length-1];
    }

    public int solve(int [] nums, int i){
        if(i == 0)return nums[0];
        if(i < 0)return 0;

        return Math.max(solve(nums, i-1), solve(nums, i-2) + nums[i]);
    }
}
