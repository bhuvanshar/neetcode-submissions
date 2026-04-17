class Solution {
    public int computeArea(int length, int height){
        return length*height;
    }

    public int maxArea(int[] heights){
        int left = 0;
        int right = heights.length-1;
        
        int area = computeArea(Math.min(heights[left],heights[right]), right-left);
        int maxArea = area;
        while(left < right){
            if(heights[left] < heights[right]){
                left++;
                area = computeArea(Math.min(heights[left],heights[right]), right-left);
                maxArea = Math.max(maxArea, area);
            }else {
                right--;
                area = computeArea(Math.min(heights[left],heights[right]), right-left);
                maxArea = Math.max(maxArea, area);
            }
        }
        return maxArea;
    }
}
