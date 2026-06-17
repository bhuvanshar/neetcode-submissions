class Solution {
    public int rob(int[] nums) {
        if(nums.length ==0 )return 0;
        if(nums.length == 1)return nums[0];
        int n = nums.length;
        int [] memo = new int [n];
        int [] memo2 = new int [n];

        Arrays.fill(memo, -1);
        Arrays.fill(memo2, -1);

        return Math.max(linear(nums, 1, n-1, memo), linear(nums, 0, n-2, memo2));
    }

    public int linear(int [] nums, int l, int r, int [] memo){
        if(r-l == 0)return nums[l];
        if(r-l < 0) return 0;
        if(r-l == 1)return Math.max(nums[l], nums[r]);
        if(memo[r] != -1)return memo[r];
        return memo[r] = Math.max(linear(nums, l, r-1, memo), linear(nums, l, r-2, memo) + nums[r]);
    }
}
