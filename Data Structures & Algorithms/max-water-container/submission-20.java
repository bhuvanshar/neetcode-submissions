class Solution {
    public int area(int [] arr, int l, int r){
        int h = Math.min(arr[l],arr[r]);
        int b = r-l;
        return h*b;
    }
    public int maxArea(int[] heights) {
        int l = 0;
        int r = heights.length-1;
        int max = 0;
        while(l < r){
            if(heights[l] < heights[r]){
                
                max = Math.max(max, area(heights, l, r));
                l++;
            }else{
                
                max = Math.max(max, area(heights, l, r));
                r--;
            }
        }
        max = Math.max(max, area(heights, l, r));
        return max;
    }
}
