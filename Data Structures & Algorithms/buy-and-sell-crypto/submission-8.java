class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        for(int i=0;i<prices.length;i++){
            int buy = prices[i];
            int l = i+1;
            while(l < prices.length && prices[i] < prices[l]){
                int profit = prices[l]-prices[i];
                maxProfit = Math.max(profit, maxProfit);
                l++;
            }
            i = l-1;
        }
        return maxProfit;
    }
}
