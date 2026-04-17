class Solution {
    public int maxArea(int[] heights) {
        int l = 0;
		int r = heights.length-1;
		int area = Math.min(heights[l], heights[r])*(r-l);
		while(l < r) {
			if(heights[l] < heights[r]) {
				l++;
			}else {
				r--;
			}
			area = Math.max(area, Math.min(heights[l], heights[r])*(r-l));
		}
		area = Math.max(area, Math.min(heights[l], heights[r])*(r-l));
		
		return area;
    }
}
