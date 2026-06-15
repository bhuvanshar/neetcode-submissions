class Solution {
    public int maxProfit(int[] prices) {
        Map<String, Integer>memo = new HashMap<>();
        return memo(prices, 0, true, memo);
    }

    public int solve(int [] prices, int i, boolean buying){
        if(i>=prices.length){
            return 0;
        }
        int cooldown = solve(prices, i+1, buying);

        if(buying){
            int buy = solve(prices, i+1, !buying) - prices[i];
            return Math.max(cooldown, buy);
        }else{
            int sell = solve(prices, i+2, !buying) + prices[i];
            return Math.max(cooldown, sell);
        }
    }

    public int memo(int [] prices, int i, boolean buying, Map<String, Integer> memo){
        if(i >= prices.length){
            return 0;
        }

        String key = i + "-" + buying;
        if(memo.containsKey(key)){
            return memo.get(key);
        }

        int cooldown = memo(prices, i+1, buying, memo);
        if(buying){
            int buy = memo(prices, i+1, !buying, memo) - prices[i];
            memo.put(key, Math.max(cooldown, buy));
            return Math.max(cooldown, buy);
        }else{
            int sell = memo(prices, i+2, !buying, memo) + prices[i];
            memo.put(key, Math.max(cooldown, sell));
            return Math.max(cooldown, sell);
        }
    }
}
