class Solution {
    private final int [][] MOVES = {{0,1},{0,-1},{1,0},{-1,0}};
    public void islandsAndTreasure(int[][] grid) {
        Queue<int[]> queue = new LinkedList<>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j] == 0){
                    queue.offer(new int []{i,j});
                }
            }
        }

        while(!queue.isEmpty()){
            int [] curr = queue.poll();
            int i = curr[0];
            int j = curr[1];

            for(int [] mo : MOVES){
                int ni = i + mo[0];
                int nj = j + mo[1];
                if(ni >= grid.length || nj >= grid[0].length || ni < 0 || nj < 0 || grid[ni][nj] != Integer.MAX_VALUE){
                    continue;
                }
                queue.offer(new int []{ni,nj});
                grid[ni][nj] = grid[i][j] + 1;
            }
        }
    }
}
