class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length == 0)return false;
        int rowNumber = 0;
        boolean foundRow = false;
        for(int i=0;i<matrix.length;i++){
            if(matrix[i][matrix[0].length-1] >= target){
                rowNumber = i;
                foundRow = true;
                break;
            }
        }
        if(!foundRow)return false;
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
