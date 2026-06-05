class Solution {
    private static final int [][] MOVES = {{1,0},{0,1},{-1,0},{0,-1}};
    public int maxAreaOfIsland(int[][] grid) {
        int max = 0;
        boolean [][] vis = new boolean [grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j] == 1 && !vis[i][j]){
                    int count = 1;
                max = Math.max(max, bfs(grid, i, j, grid.length, grid[0].length,count, vis));
                }
                
            }
        }
        return max;
    }

    public int bfs(int[][] grid, int i, int j, int n, int m, int count, boolean [][] vis){
        Queue<int []> queue = new LinkedList<>();
        queue.offer(new int []{i,j});
        vis[i][j]=true;

        while(!queue.isEmpty()){
            int [] curr = queue.poll();
            int ri = curr[0];
            int cj = curr[1];
            for(int [] mo : MOVES){
            int ni = mo[0] + ri;
            int nj = mo[1] + cj;
            if(ni >= 0 && nj >= 0 && ni < n && nj < m && grid[ni][nj] == 1 && !vis[ni][nj]){
                vis[ni][nj] = true;
                count++;
                queue.offer(new int []{ni,nj});
                }
            }
        }
        
    return count;
    }
}
