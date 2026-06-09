class Solution {
    private final int [][] MOVES = {{1,0},{0,1},{-1,0},{0,-1}};
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int n = heights.length;
        int m = heights[0].length;
        boolean [][] pac = new boolean [n][m];
        boolean [][] alt = new boolean [n][m];

        for(int i=0;i<n;i++){
            dfs(heights, pac, i, 0, n, m);
            dfs(heights, alt, i, m-1, n, m);
        }
        for(int i=0;i<m;i++){
            dfs(heights, pac, 0, i, n, m);
            dfs(heights, alt, n-1, i, n, m);
        }
        List<List<Integer>> result = new ArrayList<>();
        for(int i=0;i<n;i++){
            List<Integer>res = new ArrayList<>();
            for(int j=0;j<m;j++){
                if(pac[i][j] && alt[i][j]){
                    result.add(Arrays.asList(i,j));
                }
            }
        }
        return result;
    }

    public void dfs(int [][] heights, boolean [][] vis, int i, int j, int n, int m){
        vis[i][j] = true;
        for(int [] mo : MOVES){
            int ni = i + mo[0];
            int nj = j + mo[1];
            if(ni < n && nj < m && ni >= 0 && nj >= 0 && heights[ni][nj] >= heights[i][j] && !vis[ni][nj]){
                vis[ni][nj] = true;
                dfs(heights, vis, ni,nj,n,m);
            }
        }
    }
}
