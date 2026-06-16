class Solution {
    public static final int [][] MOVES = {{1,0},{0,1},{-1,0},{0,-1}};
    public static final int FRESH = 1;
    public static final int ROTTEN = 2;
    public int orangesRotting(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        Queue<int []> queue = new LinkedList<>();
        boolean [][] vis = new boolean [n][m];
        int fresh = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j] == FRESH){
                    fresh++;
                }else if(grid[i][j] == ROTTEN){
                    queue.offer(new int[]{i,j});
                }
            }
        }
        int time = 0;
        while(!queue.isEmpty() && fresh > 0){
            int size = queue.size();
            for(int k=0;k<size;k++){
            int [] node = queue.poll();
            int i = node[0];
            int j = node[1];
            for(int [] mo : MOVES){
                int ni = i + mo[0];
                int nj = j + mo[1];
                if(ni < n && nj < m && ni >= 0 && nj >= 0 && grid[ni][nj] == FRESH){
                    grid[ni][nj] = ROTTEN;
                    fresh--;
                    queue.offer(new int []{ni,nj});
                    }
                }
            }
            time++;
        }
        return fresh == 0 ? time : -1;
    } 
}
