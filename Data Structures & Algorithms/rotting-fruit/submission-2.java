class Solution {
    private final int [][] MOVES = {{1,0},{0,1},{-1,0},{0,-1}};
    public int orangesRotting(int[][] grid) {
        int fresh = 0;
        int min = 0;
        Queue<int []> queue = new LinkedList<>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j] == 1){
                    fresh++;
                }else if(grid[i][j] == 2){
                    queue.offer(new int []{i,j,0});
                }
            }
        }
        int time = 0;
        while(!queue.isEmpty()){
            int [] curr = queue.poll();
            int i = curr[0];
            int j = curr[1];
            int t = curr[2];
            min = Math.max(min,t);
            for(int [] mo : MOVES){
                int ni = i + mo[0];
                int nj = j + mo[1];
                if(ni >= 0 && nj >= 0 && ni < grid.length && nj < grid[0].length && grid[ni][nj] == 1){
                    fresh--;
                    grid[ni][nj] = 2;
                    queue.offer(new int []{ni,nj,t+1});
                }
            }
        }
        if(fresh == 0)return min;
        else return -1;
    }
}
