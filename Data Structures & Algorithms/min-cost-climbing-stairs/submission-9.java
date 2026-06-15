class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int [] memo = new int [n+1];
        Arrays.fill(memo,-1);
        // return Math.min(memo(cost, n-1, memo), memo(cost, n-2,memo));
        // return Math.min(solve(cost, n-1), solve(cost, n-2));
        return tab(cost);

    }
    public int solve(int [] cost, int i){
        if(i < 0)return 0;
        if(i <= 1)return cost[i];

        return Math.min(solve(cost, i-1), solve(cost, i-2)) + cost[i];
    }

    public int memo(int [] cost, int i, int [] memo){
        if(i < 0)return 0;
        if(i <= 1)return cost[i];
        if(memo[i] != -1)return memo[i];
        return memo[i] = Math.min(memo(cost, i-1, memo), memo(cost, i-2, memo))+cost[i];
    }

    public int tab(int [] cost){
        int n = cost.length;
        int [] dp = new int [n+1];
        dp[0] = cost[0];
        dp[1] = cost[1];

        for(int i=2;i<n;i++){
            dp[i] = Math.min(dp[i-1], dp[i-2]) + cost[i];
        }
        return Math.min(dp[n-1], dp[n-2]);
    }
}
