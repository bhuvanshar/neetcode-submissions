class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rowNumber = 0;
        int check = 0;
        for(int i=0;i<matrix.length;i++){
            if(matrix[i][matrix[0].length-1] >= target){
                rowNumber = i;
                break;
            }
            check++;
        }
        if(check == matrix.length)return false;
        if(matrix[rowNumber][matrix[0].length-1] == target){
            return true;
        }else{
            int [] bsa = matrix[rowNumber];

            int l = 0;
            int r = bsa.length-1;

            while(l <= r){
                int mid = l+ (r-l)/2;
                if(bsa[mid] < target){
                    l = mid+1;
                }else if(bsa[mid] > target){
                    r = mid-1;
                }else{
                    return true;
                }
            }
            return false;
        }
    }
}
