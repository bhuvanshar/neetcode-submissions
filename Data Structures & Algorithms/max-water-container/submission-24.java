class Solution {
    public int area(int l, int r, int b){
        return Math.min(l,r)*b;
    }
    public int maxArea(int[] h) {
        int l = 0;
        int r = h.length-1;
        int maxArea = 0;
        while(l < r){
            if(h[l] < h[r]){
                maxArea = Math.max(maxArea, area(h[l],h[r],r-l));
                l++;
            }else{
                maxArea = Math.max(maxArea, area(h[l],h[r],r-l));
                r--;
            }
            maxArea = Math.max(maxArea, area(h[l],h[r],r-l));
        }
        return maxArea;
    }
}
