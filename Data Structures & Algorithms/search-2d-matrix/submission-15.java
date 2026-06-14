class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        int row = 0;
        for(int i=0;i<matrix.length;i++){
            if(matrix[i][m-1] < target){
                continue;
            }else {
                row = i;
                break;
            }
        }
        int [] arr = matrix[row];
        return biarySearch(arr, target) != -1 ? true : false;
    }
    public int biarySearch(int [] arr, int target){
        int l = 0;
        int r = arr.length-1;
        while(l<=r){
            int mid = l + (r-l)/2;
            if(arr[mid] < target){
                l = mid+1;
            }else if (arr[mid] > target){
                r = mid-1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
