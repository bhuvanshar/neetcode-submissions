class Solution {
    public int coinChange(int[] coins, int amount) {
        int [] memo = new int [amount + 1];
        Arrays.fill(memo, -99);
        return memo(coins, amount, memo);
    }

    public int solve(int [] coins, int amt){
        if(amt == 0)return 0;
        if(amt < 0) return -1;
        int best = Integer.MAX_VALUE;
        for(int c : coins){
            int sub = solve(coins, amt-c);
            if(sub >= 0){
                best = Math.min(best, sub +1);
            }
        }
        return best == Integer.MAX_VALUE ? -1 : best;
    }

    public int memo(int [] coins, int amt, int [] memo){
        if(amt == 0)return 0;
        if(amt < 0)return -1;

        if(memo[amt] != -99) return memo[amt];
        int best = Integer.MAX_VALUE;
        for(int c : coins){
            int sub = memo(coins, amt-c, memo);
            if(sub >= 0){
                best = Math.min(best, sub+1);
            }
        }
        return memo[amt] = best == Integer.MAX_VALUE ? -1 : best;
    }
}
