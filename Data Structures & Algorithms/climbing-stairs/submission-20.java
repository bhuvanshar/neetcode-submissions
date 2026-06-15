class Solution {
    public int climbStairs(int n) {
        int [] dp = new int [n+1];
        Arrays.fill(dp, -1);
        return memo(n, dp);
    }
    public int solve(int n){
        if(n <= 1)return 1;

        return solve(n-1) + solve(n-2);
    }

    public int memo(int n, int [] dp){
        if(n <= 1){
            return 1;
        }
        if(dp[n] != -1)return dp[n];

        return dp[n] = memo(n-1, dp) + memo(n-2, dp);
    }
}
