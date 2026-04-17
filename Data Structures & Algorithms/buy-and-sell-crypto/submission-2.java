class Solution {
    public int maxProfit(int[] prices) {
         int maxProfit = 0;
            for(int i=0;i<prices.length;i++){
                int buyPrice = prices[i];
                for(int j=i+1;j<prices.length;j++){
                    int sellPrice = prices[j];
                    if(buyPrice < sellPrice){
                        maxProfit = Integer.max(sellPrice-buyPrice, maxProfit);
                    }
                }
            }
            return maxProfit;
    }
}
