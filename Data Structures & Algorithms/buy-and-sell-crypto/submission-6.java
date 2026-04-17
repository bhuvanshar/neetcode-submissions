class Solution {
    public int maxProfit(int[] prices) {
       int maxProfit = 0;
		for(int i=0;i<prices.length;i++) {
			int r = i+1;
			while(r < prices.length) {
				if(prices[r] < prices[i]) {
					i = r;
				}else {
					int profit = prices[r] - prices[i];
					maxProfit = Math.max(maxProfit, profit);
				}
				r++;
			}
		}
		
		return maxProfit; 
    }
}
