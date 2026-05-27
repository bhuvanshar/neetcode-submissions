class Solution {
    private final int [][] MOVES = {{1,0},{0,1},{-1,0},{0,-1}};
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int m = heights.length;
        int n = heights[0].length;
        boolean [][] alt = new boolean [m][n];
        boolean [][] pac = new boolean [m][n];
        List<List<Integer>> res = new ArrayList<>();
        for(int i=0;i<m;i++){
            dfs(heights, pac, i, 0, m, n);
            dfs(heights, alt, i, n-1, m,n);
        }
        for(int j=0;j<n;j++){
            dfs(heights, pac, 0, j, m, n);
            dfs(heights, alt, m-1, j, m, n);
        }

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(pac[i][j] && alt[i][j]){
                    res.add(Arrays.asList(i,j));
                }
            }
        }
    return res;
    }
    public void dfs(int [][] h, boolean [][] vis, int i, int j, int m, int n){
        vis[i][j] = true;

        for(int [] mo : MOVES){
            int ni = i + mo[0];
            int nj = j + mo[1];
            if(ni >=0 && ni < m && nj >=0 && nj < n && !vis[ni][nj] && h[i][j] <= h[ni][nj]){
                dfs(h, vis, ni, nj, m, n);
            }
        }
    }
}
