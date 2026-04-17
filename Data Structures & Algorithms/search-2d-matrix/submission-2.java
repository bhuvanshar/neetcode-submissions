class Solution {
    public boolean binartSearchInMatrix(int [] arr,int target){
        int l = 0;
        int r = arr.length-1;
        while(l <= r){
           int mid = l + (r - l) / 2;
           if(arr[mid] < target){
            l = mid+1;
           }else if(arr[mid] > target){
            r = mid-1;
           }else{
            return true;
           }
        }
        return false;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length == 0)
        return false;
        int n = matrix[0].length-1;
        int i=0;
        while(i<matrix.length){
            if(matrix[i][n] < target){
                i++;
            }else if(matrix[i][n] > target){
                return binartSearchInMatrix(matrix[i], target);
            }else{
                return true;
            }
        }
        return false;
    }
}
