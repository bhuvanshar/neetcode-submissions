class Solution {
    private final int [][] MOVES = {{1,0},{0,1},{-1,0},{0,-1}};
    public void solve(char[][] board) {
        int m = board.length;
        int n = board[0].length;
        for(int i=0;i<m;i++){
            dfs(board, i, 0, m, n);
            dfs(board, i, n-1, m, n);
        }
        for(int j=0;j<n;j++){
            dfs(board, 0, j, m, n);
            dfs(board, m-1, j, m, n);
        }

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(board[i][j] == 'O'){
                    board[i][j] = 'X';
                }
                else if(board[i][j] == '#'){
                    board[i][j] = 'O';
                }
            }
        }

}


    public void dfs(char[][] board, int i, int j, int m, int n){
        if (i < 0 || i >= m || j < 0 || j >= n || board[i][j] != 'O') {

            return;

        }
        board[i][j] = '#';
        for(int [] mo : MOVES){
            int ni = i + mo[0];
            int nj = j + mo[1];
            if(ni >=0 && ni < m && nj >=0 && nj < n && board[ni][nj] == 'O'){
                
                dfs(board, ni,nj,m,n);
            }
        }
    }
}
