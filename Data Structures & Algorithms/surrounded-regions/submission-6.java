class Solution {
    private final int [][] MOVES = {{1,0},{0,1},{-1,0},{0,-1}};
    public void solve(char[][] b) {
        int n = b.length;
        int m = b[0].length;
        for(int i=0;i<n;i++){
            if(b[i][0] == 'O')b[i][0] = '#';
            if(b[i][m-1] == 'O')b[i][m-1] = '#';
        }
        for(int j=0;j<m;j++){
            if(b[0][j] == 'O')b[0][j] = '#';
            if(b[n-1][j] == 'O')b[n-1][j] = '#';
        }
        for(int i=0;i<n;i++){
            dfs(b, i, 0, n, m);
            dfs(b, i, m-1, n, m);
        }
        for(int j=0;j<m;j++){
            dfs(b, 0, j, n, m);
            dfs(b, n-1, j, n, m);
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(b[i][j] == '#'){
                    b[i][j] = 'O';
                }else if(b[i][j] == 'O'){
                    b[i][j] = 'X';
                }
            }
        }
    }
    public void dfs(char [][] b, int i, int j, int n, int m){
        if(b[i][j] == '#'){
            for(int [] mo : MOVES){
                int ni = i + mo[0];
                int nj = j + mo[1];
                if(ni >= 0 && nj >= 0 && ni < n && nj < m && b[ni][nj] == 'O'){
                    b[ni][nj] = '#';
                    dfs(b, ni, nj, n, m);
                }
            }
        }
    }
}
