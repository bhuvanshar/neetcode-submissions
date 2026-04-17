class Solution {
    public int maxProfit(int[] nums) {
                int l = 0;
                int r = 1;
                int profit = 0;
                while(r<nums.length){
                        if(nums[l] < nums[r]){
                               profit = Math.max(profit, nums[r] - nums[l]); 
                        }else{
                                l = r;
                        }
                        r++;
                }
                return profit;
    }
}
