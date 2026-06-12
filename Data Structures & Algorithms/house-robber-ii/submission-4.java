class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n == 0)return 0;
        if(n == 1)return nums[0];
        int [] memo1 = new int [n];
        int [] memo2 = new int [n];
        Arrays.fill(memo1, -1);
        Arrays.fill(memo2, -1);
        // return Math.max(linear(nums, 0, n-2), linear(nums, 1, n-1));    
        return Math.max(memo(nums, 0, n-2, memo1), memo(nums, 1, n-1, memo2));    

    }

    public int linear(int [] nums, int lo, int hi){
        if(hi < lo)return 0;
        if(hi == lo)return nums[lo];

        return Math.max(linear(nums, lo, hi-1), linear(nums, lo, hi-2) + nums[hi]);
    }

    public int memo(int [] nums, int lo, int hi, int [] memo){
        if(hi < lo)return 0;
        if(hi == lo)return nums[lo];
        if(memo[hi] != -1)return memo[hi];
        return memo[hi] = Math.max(memo(nums, lo, hi-1, memo), memo(nums, lo, hi-2, memo) + nums[hi]);
    }

}
