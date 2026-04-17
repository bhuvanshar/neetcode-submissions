class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        if(matrix.length == 0)return false;
        int rows = matrix.length;
        int cols = matrix[0].length;
        if(matrix[rows-1][cols-1] < target)return false;
        int top = 0;
        int bottom = rows-1;
        while(top <= bottom){
            int mid = top + (bottom - top)/2;
            if(matrix[mid][cols-1] < target){
                top = mid+1;
            }else if(matrix[mid][0] > target){
                bottom = mid-1;
            }else{
                int [] arr = matrix[mid];
                int l = 0;
                int r = arr.length-1;
                while(l <= r){
                    int m = l + (r-l)/2;
                    if(arr[m] < target){
                        l = m+1;
                    }else if(arr[m] > target){
                        r = m-1;
                    }else{
                        return true;
                    }
                }
                return false;
            }
        }
        return false;
    }
}
