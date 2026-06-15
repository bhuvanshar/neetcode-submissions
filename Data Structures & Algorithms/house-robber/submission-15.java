class Solution {
    public int rob(int[] nums) {
        int [] memo = new int [nums.length+1];
        Arrays.fill(memo, -1);
        return memo(nums, nums.length-1, memo);
    }

    public int solve(int [] n, int i){
        if(i < 0)return 0;
        if(i <= 1)return n[i];

        return Math.max(solve(n, i-1), solve(n, i-2) + n[i]);
    }
    public int memo(int [] n, int i, int [] memo){
        if(i < 0)return 0;
        if(i == 0)return n[0];
        if(memo[i] != -1)return memo[i];

        return memo[i] = Math.max(memo(n, i-1,memo), memo(n, i-2, memo) + n[i]);
    }
}
