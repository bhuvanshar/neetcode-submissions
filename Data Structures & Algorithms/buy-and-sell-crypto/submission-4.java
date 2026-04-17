class Solution {
    public int maxProfit(int[] nums) {
int l = 0;
            int r  = 1;
            int profit = 0;
            int maxProfit = 0;
            while(r < nums.length){
                if(nums[l] < nums[r]){
                    profit = nums[r] - nums[l];
                    maxProfit = Integer.max(maxProfit, profit);
                }else{
                    l = r;
                }
                r++;
            }
            return maxProfit;
    }
}
