class Solution {
    // public int climbStairs(int n) {
    //     int [] memo = new int[n+1];
    //     Arrays.fill(memo, -1);
    //     return solve(n, memo);
    // }
    // public int solve(int n, int [] memo){
    //     if(n <= 1)return 1;
        
    //     if(memo[n] != -1)return memo[n];
    //     memo[n] = solve(n-1, memo) + solve(n-2, memo);
    //     return memo[n];
    // }
    // Bottom up
    // public int climbStairs(int n) {
    //     int [] dp = new int [n+1];
    //     dp[0] = 1;
    //     dp[1] = 1;
    //     for(int i=2;i<=n;i++){
    //         dp[i] = dp[i-1] + dp[i-2];
    //     }
    //     return dp[n];
    // }
    public int climbStairs(int n) {
        int [] dp = new int [n+1];
        int prev1 = 1;
        int prev2 = 1;
        for(int i=2;i<=n;i++){
            int prev3 = prev1 + prev2;
            prev2 = prev1;
            prev1 = prev3;
        }
        return prev1;
    }
    
}
