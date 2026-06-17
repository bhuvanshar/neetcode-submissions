class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int [] memo = new int [n];
        Arrays.fill(memo, -1);
        return solve(nums, n-1, memo);
    }

    public int solve(int [] nums, int i, int [] memo){
        if(i == 0)return nums[0];
        if(i < 0)return 0;
        if(i == 1)return Math.max(nums[0], nums[1]);
        if(memo[i] != -1)return memo[i];
        return memo[i] = Math.max(solve(nums, i-1, memo), solve(nums, i-2, memo) + nums[i]);
    }
}
