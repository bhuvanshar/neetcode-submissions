class Solution {
    private final int [][] MOVES = {{1,0},{0,1},{-1,0},{0,-1}};
    int area = 0;
    public int maxAreaOfIsland(int[][] grid) {
        // int area = 0;
        int n = grid.length;
        int m = grid[0].length;
        int max = 0;
        boolean [][] vis = new boolean [n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(!vis[i][j] && grid[i][j] == 1){
                    area = 0;
                    dfs(grid, i, j, n, m, vis);
                    max = Math.max(max, area);
                }
            }
        }
        return max;
    }
    public void dfs(int [][] grid, int i, int j, int n, int m, boolean [][] vis){
        area += 1;
        vis[i][j] = true;

        for(int [] mo : MOVES){
            int ni = i + mo[0];
            int nj = j + mo[1];
            if(ni < n && nj < m && ni >= 0 && nj >= 0 && grid[ni][nj] == 1 && !vis[ni][nj]){
                dfs(grid, ni, nj, n, m, vis);
            }
        }
    }
}
