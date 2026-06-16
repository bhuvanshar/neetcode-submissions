class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int [] memo = new int [n+1];
        Arrays.fill(memo, -1);
        return Math.min(memo(cost, n-1, memo), memo(cost, n-2, memo));
    }

    public int solve(int [] cost, int i){
        if(i < 0)return 0;
        if(i <= 1)return cost[i];

        return cost[i] + Math.min(solve(cost, i-1), solve(cost, i-2));
    }

    public int memo(int [] cost, int i, int [] memo){
        if(i<0){
            return 0;
        }
        if(i <= 1)return cost[i];
        if(memo[i] != -1)return memo[i];
        return memo[i] = Math.min(memo(cost, i-1, memo), memo(cost, i-2, memo)) + cost[i];
    }
}
