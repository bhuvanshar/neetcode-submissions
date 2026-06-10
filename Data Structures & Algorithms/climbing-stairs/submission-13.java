class Solution {
    static int [] memo = new int [46];
    public int climbStairs(int n) {
        Arrays.fill(memo, -1);
        int [] dp = new int [46];

        return solveDp(n, dp);
    }
    public int solve(int n){
        if(n <= 1){
            return 1;
        }
        if(memo[n] != -1){
            return memo[n];
        }

     memo[n] = solve(n-1) + solve(n-2);
     return memo[n];
    }
    public int solveDp(int n, int [] dp){
       dp[0] = 1;
       dp[1] = 2;
       for(int i=2;i<n;i++){
        dp[i] = dp[i-1] + dp[i-2];
       }
       return dp[n-1];
    }
}
