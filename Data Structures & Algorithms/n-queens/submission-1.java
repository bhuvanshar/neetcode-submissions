class Solution {
    Set<Integer>posDiag = new HashSet<>();
    Set<Integer>negDiag = new HashSet<>();
    Set<Integer>col = new HashSet<>();
    List<List<String>>res = new ArrayList<>();
    public List<List<String>> solveNQueens(int n) {
        char [][] board = new char [n][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j] = '.';
            }
        }
        backtrack(0, board, n);
        return res;
    }
    public void backtrack(int r, char [][] board, int n){
        if(r == n){
            List<String> copy = new ArrayList<>();
            for(char [] b : board){
                copy.add(new String(b));
            }
            res.add(copy);
            return;
        }
        for(int c=0;c<n;c++){
            if(col.contains(c) || posDiag.contains(r+c) || negDiag.contains(r-c)){
                continue;
            }
            posDiag.add(r+c);
            negDiag.add(r-c);
            col.add(c);
            board[r][c] = 'Q';
            backtrack(r+1, board, n);
            posDiag.remove(r+c);
            negDiag.remove(r-c);
            col.remove(c);
            board[r][c] = '.';
        }
    }
}
