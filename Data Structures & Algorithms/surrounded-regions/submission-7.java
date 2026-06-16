class Solution {
    private static final int [][] MOVES = {{1,0},{0,1},{-1,0},{0,-1}};
    public void solve(char[][] board) {
        int n = board.length;
        int m = board[0].length;
        boolean [][] vis = new boolean [n][m];

        for(int i=0;i<n;i++){
            if(board[i][0] == 'O')dfs(board, i, 0, n, m, vis);
            if(board[i][m-1] == 'O')dfs(board, i, m-1, n, m, vis);
        }
        for(int j=0;j<m;j++){
            if(board[0][j] == 'O')dfs(board, 0, j, n, m, vis);
            if(board[n-1][j] == 'O')dfs(board, n-1, j, n, m, vis);
        }
        for(int i=1;i<n-1;i++){
            for(int j=1;j<m-1;j++){
                if(!vis[i][j]){
                    board[i][j] = 'X';
                }
            }
        }
    }

    public void dfs(char [][] board, int i, int j, int n, int m, boolean [][] vis){
        vis[i][j] = true;
        for(int [] mo : MOVES){
            int ni = i + mo[0];
            int nj = j + mo[1];
            if(ni < n && nj < m && ni >= 0 && nj >= 0 && board[ni][nj] == 'O' && !vis[ni][nj]){
                dfs(board, ni, nj, n, m, vis);
            }
        }
    }
}
