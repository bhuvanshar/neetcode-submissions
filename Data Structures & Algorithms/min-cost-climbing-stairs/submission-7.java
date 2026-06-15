class Solution {
    public int minCostClimbingStairs(int[] cost) {
        if(cost.length == 0)return 0;
        if(cost.length == 1)return cost[0];
        // int [][] memo = new int [cost.length+1][100];
        // for(int x=0;x<= cost.length; x++)
        // Arrays.fill(memo[x], -1);
        int [] memo = new int [cost.length+1];
        Arrays.fill(memo, -1);
        // return Math.min(memo(cost, 0, 0, memo), memo(cost, 1, 0, memo));
        return Math.min(rec(cost, cost.length-1, memo), rec(cost,cost.length-2, memo));

    }
    public int solve(int [] cost, int i, int cst){
        if(i >= cost.length){
            return cst;
        }

        return Math.min(solve(cost, i+1, cst + cost[i]), solve(cost, i+2, cst + cost[i]));
    }

    public int rec(int [] cost, int i, int [] memo){
        if(i < 0){
            return 0;
        }
        if(i <= 1){
            return cost[i];
        }
        if(memo[i] != -1)return memo[i];
        int c = memo [i] = Math.min(rec(cost, i-1, memo) , rec(cost, i-2, memo)) + cost[i] ;
        return memo[i];
    }
}
