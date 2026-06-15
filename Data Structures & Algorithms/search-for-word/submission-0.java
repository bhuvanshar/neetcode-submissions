class Solution {
    public boolean exist(char[][] board, String word) {
        int n = board.length;
        int m = board[0].length;
        boolean [][] visited = new boolean [n][m];
        List<int []> path = new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(dfs(board, word, 0, i, j, visited, n, m)){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean dfs(char[][] board, String word, int i, int r, int c, boolean [][] visited, int n, int m){
        if(i == word.length()){
            return true;
        }
        if(r < 0 || 
            c < 0 || 
            r >= n || 
            c >= m || 
            word.charAt(i) != board[r][c] || 
            visited[r][c])
            {
                return false;
        }
        visited[r][c] = true;

        boolean valid = dfs(board, word, i+1, r+1, c, visited, n, m)||
                        dfs(board, word, i+1, r-1, c, visited, n, m)||
                        dfs(board, word, i+1, r, c+1, visited, n, m)||
                        dfs(board, word, i+1, r, c-1, visited, n, m);
        visited[r][c] = false;
        return valid;

    }

}
