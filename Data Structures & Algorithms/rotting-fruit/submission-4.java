class Solution {
    private final int [][] MOVES = {{1,0},{0,1},{-1,0},{0,-1}};
    public int orangesRotting(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int fresh = 0;
        Queue<int []> queue = new LinkedList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j] == 1){
                    fresh++;
                }else if(grid[i][j] == 2){
                    queue.offer(new int []{i,j,0});
                }
            }
        }
        int min = 0;
        while(!queue.isEmpty()){
            int [] curr = queue.poll();
            int i = curr[0];
            int j = curr[1];
            int t = curr[2];
            min = Math.max(min,t);
            for(int [] mo : MOVES){
                int ni = mo[0] + i;
                int nj = mo[1] + j;
                if(ni < n && nj < m && ni >= 0 && nj >= 0 && grid[ni][nj] == 1){
                    grid[ni][nj] = 2;
                    fresh--;
                    queue.offer(new int []{ni,nj,t+1});
                }
            }
        }
        return fresh == 0 ? min : -1;
    }
}
