class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int [][] memo = new int [n+1][n+1];
        for(int i=0;i<=n;i++){
            Arrays.fill(memo[i], -1);
        }
        return memo(nums, 0, -1, memo);
    }

    public int solve(int [] nums, int index, int prevIndex){
        if(index == nums.length)return 0;

        int notTake = solve(nums, index+1, prevIndex);
        int take = 0;
        if(prevIndex == -1 || nums[index] > nums[prevIndex]){
            take = 1 + solve(nums, index+1, index);
        }

        return Math.max(take, notTake);
    }

    public int memo(int [] nums, int index, int prevIndex, int [][] memo){
        if(index == nums.length)return 0;
        if(memo[index][prevIndex+1] != -1)return memo[index][prevIndex+1];

        int notTake = memo(nums, index+1, prevIndex, memo);
        int take = 0;
        if(prevIndex == -1 || nums[index] > nums[prevIndex]){
            take = 1 + memo(nums, index+1, index, memo);
        }
        return memo[index][prevIndex+1] = Math.max(take, notTake);
    }
}
