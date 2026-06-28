class Solution {
    public int[][] multiply(int[][] mat1, int[][] mat2) {
        return matrixMultiplication(mat1, mat2);
        
    }

    public static int [][] matrixMultiplication(int [][] mat1, int [][] mat2){

//        {
//            {1,0,0},
//            {-1,0,3}
//        };
//
//
//        {
//            {7,0,0},
//            {0,0,0},
//            {0,0,1}
//        }

        int rx = 0;
        int c = 0;
        int y = 0;
        int t = 0;
        int sum = 0;
        int [][] res = new int [mat1.length][mat2[0].length];
        while(t < mat1.length){
            while(c < mat2[0].length){
                while(y < mat2.length){
                    sum += mat2[y][c] * mat1[t][rx];
                    y++;
                    rx++;
                }
                res[t][c] = sum;
                y=0;
                rx=0;
                c++;
                sum=0;
            }
            t++;
            c=0;
        }
//        System.out.println(res);
        return res;
    }
}
