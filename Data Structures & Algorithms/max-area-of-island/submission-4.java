class Solution {
    public static final int [][] MOVES = {{1,0},{0,1},{-1,0},{0,-1}};
    public int maxAreaOfIsland(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        boolean [][] vis = new boolean [n][m];
        int maxArea = 0;
        int [] area = {0};
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                
                if(grid[i][j] == 1){
                    area = new int []{0};
                    dfs(grid, i, j, vis, n, m, area);
                }
                maxArea = Math.max(area[0], maxArea);
            }
        }
        return maxArea;
    }
    public void dfs(int [][] grid, int i, int j, boolean [][] vis, int n, int m, int [] area){
        vis[i][j] = true;
        area[0] = area[0]+1;
        for(int [] mo : MOVES){
            int ni = i + mo[0];
            int nj = j + mo[1];
            if(ni >= 0 && nj >= 0 && ni < n && nj < m && !vis[ni][nj] && grid[ni][nj] == 1){
                dfs(grid, ni, nj, vis, n, m, area);
            }
        }
    }
}
