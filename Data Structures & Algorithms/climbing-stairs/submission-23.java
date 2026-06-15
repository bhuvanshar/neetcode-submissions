class Solution {
    public int climbStairs(int n) {
        int [] dp = new int [n+1];
        Arrays.fill(dp, -1);
        return spaceOpt(n);
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

    public int tab(int n){
        int [] dp = new int [n+1];
        dp[0] = 1;
        dp[1] = 1;
        for(int i=2;i<=n;i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }

    public int spaceOpt(int n){
        int prev = 1;
        int curr = 1;
        for(int i=2;i<=n;i++){
            int temp = prev;
            prev = curr + prev;
            curr = temp;
        }
        return prev;
    }
}
