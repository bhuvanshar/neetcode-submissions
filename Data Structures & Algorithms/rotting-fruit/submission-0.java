class Solution {
    private static final int [][] MOVES = {{0,1},{1,0},{-1,0},{0,-1}};
    public int orangesRotting(int[][] grid) {
        Queue<int []> queue = new LinkedList<>();
        int fresh = 0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j] == 2){
                    queue.add(new int []{i,j,0});
                }else if(grid[i][j] == 1){
                    fresh++;
                }
            }
        }
        int min = 0;
        while(!queue.isEmpty()){
            int [] val = queue.poll();
            int i = val[0];
            int j = val[1];
            int t = val[2];
            min = Math.max(min, t);
            for(int [] m : MOVES){
                int ni = i + m[0];
                int nj = j + m[1];
                if(ni >=0 && nj >= 0 && ni < grid.length && nj < grid[0].length && grid[ni][nj] == 1){
                    grid[ni][nj] = 2;
                    queue.add(new int[]{ni,nj,t+1});
                    fresh--;
                }
            }
        }
        if(fresh == 0)return min; else return -1;
    }
}
