class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int [] memo = new int [n+1];
        int [] memo2 = new int [n+1];
        Arrays.fill(memo, -1);
        Arrays.fill(memo2, -1);
        if (n == 1) return nums[0];
        return Math.max(memo(nums, 0, n-2, memo), memo(nums, 1, n-1, memo2));
        // return Math.max(linear_rob(nums, 0, n-2), linear_rob(nums, 1, n-1));
    }
    public int linear_rob(int [] nums, int l, int r){
        if(r-l < 0)return 0;
        if(r-l == 0)return nums[l];

        int startFromZero = linear_rob(nums, l, r-2) + nums[r];
        int startFromOne = linear_rob(nums, l, r-1);
        return Math.max(startFromZero, startFromOne);
    }
    public int memo(int [] nums, int l, int r, int [] memo){
        if(r-l < 0)return 0;
        if(r-l == 0)return nums[l];
        if(r-l == 1)return Math.max(nums[r], nums[l]);
        if(memo[r] != -1)return memo[r];
        int startFromZero = memo(nums, l, r-2, memo) + nums[r];
        int startFromOne = memo(nums, l, r-1, memo);
        return memo[r] = Math.max(startFromZero, startFromOne);
    }
}
