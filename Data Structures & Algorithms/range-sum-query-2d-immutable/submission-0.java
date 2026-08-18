class NumMatrix {
    public int [][] matrix;
    public NumMatrix(int[][] matrix) {
        this.matrix = matrix;
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        int nr = row2 - row1;
        int nc = col2 - col1;
        int r = row1;
        int sum = 0;
        while(r <= row2){
            for(int c=col1; c <= col2; c++){
                sum+=matrix[r][c];
            }
            r++;
        }
        return sum;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */