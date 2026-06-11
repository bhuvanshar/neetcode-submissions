class Solution {
    private final int [][] MOVES = {{1,0},{0,1},{-1,0},{0,-1}};
    public List<List<Integer>> pacificAtlantic(int[][] h) {
        int n = h.length;
        int m = h[0].length;
        boolean [][] pac = new boolean [n][m];
        boolean [][] alt = new boolean [n][m];
        List<List<Integer>>res = new ArrayList<>();
        for(int i=0;i<n;i++){
            dfs(h, i, 0, pac, n, m);
            dfs(h, i, m-1, alt, n, m);
        }
        for(int j=0;j<m;j++){
            dfs(h, 0, j, pac, n, m);
            dfs(h, n-1, j, alt, n, m);
        }

        for(int i=0;i<n;i++){
            List<Integer> arr = new ArrayList<>();
            for(int j=0;j<m;j++){
                if(pac[i][j] && alt[i][j]){
                    res.add(Arrays.asList(i,j));
                }
            }
        }
        return res;
    }
    public void dfs(int [][] h, int i, int j, boolean [][] vis, int n, int m){
        vis[i][j] = true;
        for(int [] mo : MOVES){
            int ni = i + mo[0];
            int nj = j + mo[1];
            if(ni >=0 && nj >=0 && ni < n && nj < m && h[i][j] <= h[ni][nj] && !vis[ni][nj]){

                dfs(h, ni, nj, vis, n, m);
            }
        }
    }
}
