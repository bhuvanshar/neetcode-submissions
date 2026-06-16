class Solution {
    public static final int [][] MOVES = {{1,0},{0,1},{-1,0},{0,-1}};
    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int count = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j] == '1'){
                    dfs(grid, i, j, n, m);
                    count++;
                } 
            }
        }
        return count;
    }
    public void dfs(char [][] grid, int i, int j, int n, int m){
        grid[i][j] = '0';

        for(int [] mo : MOVES){
            int ni = mo[0] + i;
            int nj = mo[1] + j;
            if(ni >= 0 && nj >= 0 && ni < n && nj < m && grid[ni][nj] == '1'){
                dfs(grid, ni, nj, n, m);
            }
        }
    }
}
