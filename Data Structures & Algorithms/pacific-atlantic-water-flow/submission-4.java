class Solution {
    private static final int [][] MOVES = {{1,0},{0,1},{-1,0},{0,-1}};
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int n = heights.length;
        int m = heights[0].length;
        boolean [][] alt = new boolean [n][m];
        boolean [][] pac = new boolean [n][m];
        List<List<Integer>> res = new ArrayList<>();
        for(int r=0;r<n;r++){
            dfs(heights, r, 0, n, m, pac);
            dfs(heights, r, m-1, n, m, alt);
        }
        for(int c=0;c<m;c++){
            dfs(heights, 0, c, n, m, pac);
            dfs(heights, n-1, c, n, m, alt);
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(pac[i][j] && alt[i][j]){
                    res.add(Arrays.asList(i,j));
                }
            }
        }
        return res;
    }
    public void dfs(int [][] grid, int i, int j, int n, int m, boolean [][] vis){
        vis[i][j] = true;
        for(int [] mo : MOVES){
            int ni = i + mo[0];
            int nj = j + mo[1];
            if(ni >= 0 && nj >= 0 && ni < n && nj < m && !vis[ni][nj] && grid[i][j] <= grid[ni][nj]){
                dfs(grid, ni, nj, n, m, vis);
            }
        }
    }
}
