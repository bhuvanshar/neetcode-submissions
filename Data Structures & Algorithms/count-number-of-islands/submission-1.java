class Solution {
    private static final int [][] MOVES = {{1,0},{0,1},{-1,0},{0,-1}};
    public int numIslands(char[][] grid) {
        int count = 0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j] == '1'){
                    count++;
                    bfs(grid, i, j, grid.length, grid[0].length);
                }
            }
        }
        return count;
    }

    public void bfs(char [][] grid, int r, int c, int n, int m){
        Queue<int []> queue = new LinkedList<>();
        queue.offer(new int []{r,c});
        grid[r][c] = '0';

        while(!queue.isEmpty()){
            int [] curr = queue.poll();
            int i = curr[0];
            int j = curr[1];
            for(int [] mo : MOVES){
                int ni = mo[0] + i;
                int nj = mo[1] + j;
                if(ni >= 0 && nj >= 0 && ni < n && nj < m && grid[ni][nj] == '1'){
                    grid[ni][nj] = '0';
                    queue.offer(new int [] {ni,nj});
                }
                
            }
        }
    }
}

