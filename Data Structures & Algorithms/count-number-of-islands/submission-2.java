class Solution {
    private final int [][] MOVES = {{1,0},{0,1},{-1,0},{0,-1}};
    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int count = 0;
        boolean [][] vis = new boolean [n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j] == '1' && !vis[i][j]){
                dfs(grid, i, j, n, m, vis);
                count++;
                }
            }
        }
        return count;
    }
    public void dfs(char[][] grid, int i, int j, int n, int m, boolean [][] vis){
        vis[i][j] = true;
        for(int [] mo : MOVES){
            int ni = i + mo[0];
            int nj = j + mo[1];
            if(ni < n && nj < m && ni >= 0 && nj >= 0 && grid[ni][nj] == '1' && !vis[ni][nj]){
                vis[ni][nj] = true;
                dfs(grid, ni, nj, n, m, vis);
            }
        }
    }
}
