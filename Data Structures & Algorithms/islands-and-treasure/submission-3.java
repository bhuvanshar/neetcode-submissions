class Solution {
    private static final int [][] MOVES = {{1,0},{0,1},{-1,0},{0,-1}};
    private static final int INF = Integer.MAX_VALUE;
    public void islandsAndTreasure(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j] == 0){
                    int [] d = new int []{-1};
                    dfs(grid, i, j, n, m, d);
                }
            }
        }
    }
    public void dfs(int [][] grid, int i, int j, int n, int m, int [] distance){
        distance[0]++;
        // grid[i][j] = Math.min(grid[i][j], distance[0]);
        grid[i][j] = distance[0];
        for(int [] mo : MOVES){
            int ni = i + mo[0];
            int nj = j + mo[1];
            if(ni < n && nj < m && ni >=0 && nj >=0 && grid[ni][nj] != -1 && grid[ni][nj] != 0 && distance[0] < grid[ni][nj]){
                dfs(grid, ni, nj, n, m, distance);
                distance[0]--;
            }
        }
    }
}
