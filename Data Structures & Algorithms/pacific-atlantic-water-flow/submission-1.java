class Solution {
    private static final int [][] MOVES = {{1,0},{0,1},{-1,0},{0,-1}};
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int n = heights.length;
        int m = heights[0].length;
        List<List<Integer>>res = new ArrayList<>();
        boolean [][] pac = new boolean [n][m];
        boolean [][] alt = new boolean [n][m];

        for(int i=0;i<n;i++){
            dfs(heights, pac, i, 0, n, m);
            dfs(heights, alt, i, m-1, n, m);
        }

        for(int j=0;j<m;j++){
            dfs(heights, pac, 0, j, n, m);
            dfs(heights, alt, n-1, j, n, m);
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

    public void dfs(int[][] heights, boolean [][] vis, int i, int j, int n, int m){
        vis[i][j] = true;
        for(int [] mo : MOVES){
            int ni = i+mo[0];
            int nj = j+mo[1];
            if(ni >= 0 && nj >= 0 && ni < n && nj < m && heights[i][j] <= heights[ni][nj] && !vis[ni][nj]){
                dfs(heights, vis, ni, nj, n, m);
            }
        }
    }
}
