class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int [][] res = new int [n][n];
        int w = n;
        for(int i=0;i<n;i++){
            int [] row = matrix[i];
            // for(int w = 0;w<n;w++)
            // System.out.println(row[w]);
            int x = 0;
            for(int r : row){
                res[x][w-1] = r;
                x++;
            }
            w--;
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                matrix[i][j] = res[i][j];
            }
        }
    }
}
