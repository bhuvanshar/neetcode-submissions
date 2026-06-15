class Solution {
    public int rob(int[] nums) {
        int [] memo = new int [nums.length+1];
        Arrays.fill(memo, -1);
        // return memo(nums, nums.length-1, memo);
        return tab(nums);
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
    public int tab(int [] num){
        if(num.length == 0)return 0;
        if(num.length == 1)return num[0];
        int n = num.length;
        int [] dp = new int [n+1];
        dp[0] = num[0];
        dp[1] = Math.max(num[0], num[1]);

        for(int i=2;i<n;i++){
            dp[i] = Math.max(dp[i-1], dp[i-2] + num[i]);
        }
        return dp[n-1];
    }
}
