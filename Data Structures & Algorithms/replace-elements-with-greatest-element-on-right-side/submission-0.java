class Solution {
    public int[] replaceElements(int[] arr) {
        int localMax = arr[arr.length-1];
        for(int i=arr.length-1;i>=0;i--){
            int curr = arr[i];
            arr[i] = localMax;
            localMax = Math.max(curr, localMax);
        }
        arr[arr.length-1] = -1;
        return arr;
    }
}