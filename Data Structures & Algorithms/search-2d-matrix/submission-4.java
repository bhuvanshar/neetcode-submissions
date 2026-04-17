class Solution {

    public boolean binarySearch(int [] arr, int target){
        int left = 0;
        int right = arr.length-1;
        while(left <= right){
            int mid = left + (right-left)/2;
            if(arr[mid] < target){
                left = mid+1;
            }else if(arr[mid] > target){
                right = mid - 1;
            }else{
                return true;
            }
        }
        return false;
    }

    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int targetIndex = 0;
        for(int i=0;i<rows; i++){
            if(matrix[i][cols-1] >= target){
                targetIndex = i;
                break;
            }
        }

        return binarySearch(matrix[targetIndex], target);
    }
}
