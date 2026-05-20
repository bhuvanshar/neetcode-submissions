class Solution {
    private static final int [][] MOVES = {{1,0},{0,1},{-1,0},{0,-1}};
    private void bfs(char[][] grid, int sr, int sc, int mr, int n){
        Queue<int []> queue = new LinkedList<>();
        queue.offer(new int []{sr,sc});
        grid[sr][sc] = '0';

        while(!queue.isEmpty()){
            int []cor = queue.poll();
            int i = cor[0];
            int j = cor[1];
            for(int [] m : MOVES){
                int ni = i + m[0];
                int nj = j + m[1];
                if(ni >=0 && nj >= 0 && ni < mr && nj < n && grid[ni][nj] == '1'){
                    grid[ni][nj] = '0';
                    queue.add(new int []{ni,nj});
                }
            }
        }
    }
    public int numIslands(char[][] grid) {
        int c = 0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j] == '1'){
                c++;
                bfs(grid, i, j, grid.length, grid[0].length);
                }
            }
        }
        return c;
    }
}
