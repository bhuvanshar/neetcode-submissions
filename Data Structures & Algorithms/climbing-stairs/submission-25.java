class Solution {
    public int climbStairs(int n) {
        int [] memo = new int [n+1];
        Arrays.fill(memo, -1);
        return memo(n, memo);
    }
    public int solve(int n){
        if(n <= 1)return 1;

        return solve(n-1) + solve(n-2);
    }

    public int memo(int n, int [] memo){
        if(n <= 1)return 1;
        if(memo[n] != -1)return memo[n];

        return memo[n] = memo(n-1, memo) + memo(n-2, memo);
    }
}
