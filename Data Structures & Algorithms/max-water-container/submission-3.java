class Solution {
    public int computeArea(int left, int right, int[] heights){
        return (right-left)*Math.min(heights[left], heights[right]);
    }
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length -1;
        int maxAreaSingle = Integer.MIN_VALUE;
        int area = computeArea(left, right, heights);

        while(left<=right){
            if(heights[left]<heights[right]){
                maxAreaSingle=Integer.max(area,maxAreaSingle);
                left++;
                area = computeArea(left, right, heights);
            }else if(heights[left]>heights[right]){
                maxAreaSingle=Integer.max(area,maxAreaSingle);
                right--;
                area = computeArea(left, right, heights);
            }else{
                maxAreaSingle=Integer.max(area,maxAreaSingle);
                area = computeArea(left, right, heights);
                left++;
            }
        }
        return Integer.max(area,maxAreaSingle);

    }
}
