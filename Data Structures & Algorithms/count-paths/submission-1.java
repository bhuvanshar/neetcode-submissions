class Solution {
    public int uniquePaths(int m, int n) {
        // return solve(0,0,m,n);
        int [][] memo = new int [m+1][n+1];
        for(int i=0;i<=m;i++){
            Arrays.fill(memo[i], -1);
        }
        return memo(0,0,m,n,memo);
    }
    public int solve(int i, int j, int n, int m){
        if(i == n-1 && j == m-1){
            return 1;
        }

        if(i >= n || j >= m)return 0;

        int right = solve(i,j+1,n,m);
        int down = solve(i+1,j,n,m);
        return right + down;
    }

    public int memo(int i, int j, int n, int m, int [][] memo){
        if(i == n-1 && j == m-1)return 1;

        if(i >= n || j >= m)return 0;

        if(memo[i][j] != -1)return memo[i][j];

        int right = memo(i, j+1, n, m, memo);
        int down = memo(i+1, j, n, m, memo);

        return memo[i][j] = right + down;
    }
}
