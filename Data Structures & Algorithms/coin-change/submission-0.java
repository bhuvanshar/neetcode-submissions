class Solution {
    public int coinChange(int[] coins, int amount) {
        int [] memo = new int [10001];
        Arrays.fill(memo, -99);
        return tabulation(coins, amount);
    }
    public int recursive(int [] coins, int amt){
        if(amt < 0)return -1;
        if(amt == 0)return 0;
        int best = Integer.MAX_VALUE;
        for(int c : coins){
            int sub = recursive(coins, amt-c);
            if(sub >= 0)
                best = Math.min(best, sub+1);
        }
        return best == Integer.MAX_VALUE ? -1 : best;
    }

    public int memoization(int [] coins, int amt, int [] memo){
        if(amt < 0)return -1;
        if(amt == 0)return 0;
        int best = Integer.MAX_VALUE;
        if(memo[amt] != -99)return memo[amt];

        for(int c : coins){
            int sub = memoization(coins, amt - c, memo);
            if(sub >= 0){
                best = Math.min(best, sub+1);
            }
        }
        return memo[amt] = best == Integer.MAX_VALUE ? -1 : best;
    }

    public int tabulation(int [] coins, int amt){
        int [] dp = new int [amt + 1];
        Arrays.fill(dp, amt+1);
        dp[0] = 0;
        for(int a = 1; a <= amt; a++){
            for(int c : coins){
                if(c <= a)dp[a] = Math.min(dp[a], dp[a-c] + 1);
            }
        }
        return dp[amt] > amt ? -1 : dp[amt];
    }
}