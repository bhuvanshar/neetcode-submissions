class Solution {
    public int computeArea(int left, int right, int h1, int h2){
        int l = right - left;
        int h = Integer.min(h1,h2);
        return l*h;
    }
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length-1;
        int maxArea = Integer.MIN_VALUE;
        int area = computeArea(left, right, heights[left], heights[right]);
        while(left < right){
            if(heights[left] <= heights[right]){
                if(area > maxArea){
                    maxArea = area;
                }
                left++;
                area = computeArea(left, right, heights[left], heights[right]);
            }else{
                if(area > maxArea){
                    maxArea = area;
                }
                right--;
                area = computeArea(left, right, heights[left], heights[right]);
            }
        }
        if(area > maxArea){
                    maxArea = area;
                }

                return maxArea;

    }
}
