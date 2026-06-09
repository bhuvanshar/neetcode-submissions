class Solution {
    private final int [][] MOVES = {{1,0},{0,1},{-1,0},{0,-1}};
    public void solve(char[][] board) {
        int n = board.length;
        int m = board[0].length;
        for(int i=0;i<n;i++){
            if(board[i][0] == 'O')board[i][0] = '#';
            if(board[i][m-1] == 'O')board[i][m-1] = '#';
        }
        for(int j=0;j<m;j++){
            if(board[0][j] == 'O')board[0][j] = '#';
            if(board[n-1][j] == 'O')board[n-1][j] = '#';
        }
        for(int i=0;i<n;i++){
            dfs(board, i, 0, n, m);
            dfs(board, i, m-1, n, m);
        }
        for(int j=0;j<m;j++){
            dfs(board, 0, j, n, m);
            dfs(board, n-1, j, n, m);
        }
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(board[i][j] == '#')board[i][j] = 'O';
                else if (board[i][j] == 'O')board[i][j] = 'X';
            }
        }
    }

    public void dfs(char[][] board, int i, int j, int n, int m){
        if(board[i][j] == '#'){
            for(int [] mo : MOVES){
                int ni = i + mo[0];
                int nj = j + mo[1];
                if(ni >= 0 && nj >= 0 && ni < n && nj < m && board[ni][nj] == 'O'){
                    board[ni][nj] = '#';
                    dfs(board, ni, nj, n, m);
                }
            }
        }
    }
}


// ["X","X","X","X"]
// ["X","X","X","X"]
// ["X","X","X","X"]
// ["O","X","X","O"]


// ["X","X","X","X"],
// ["X","X","X","X"],
// ["X","X","X","X"],
// ["X","X","X","O"]
