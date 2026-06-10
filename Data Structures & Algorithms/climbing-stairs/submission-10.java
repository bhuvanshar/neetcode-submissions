class Solution {
    static int [] memo = new int [46];
    public int climbStairs(int n) {
        Arrays.fill(memo, -1);
        return solve(n);
    }
    public int solve(int n){
        if(n <= 1){
            return 1;
        }
        if(memo[n] != -1){
            return memo[n];
        }

     memo[n] = solve(n-1) + solve(n-2);
     return memo[n];
    }
}
