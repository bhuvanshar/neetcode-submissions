class Solution {
    int [] memo = new int [101];
    public int minCostClimbingStairs(int[] cost) {
        Arrays.fill(memo, -1);
        return Math.min(solve(cost, 0), solve(cost, 1));
    }
    public int solve(int [] cost, int i){
        if(i >= cost.length){
            return 0;
        }
        if(memo[i] != -1)return memo[i];
        return memo[i] = cost[i] + Math.min(solve(cost, i+1), solve(cost, i+2));
    }
}
