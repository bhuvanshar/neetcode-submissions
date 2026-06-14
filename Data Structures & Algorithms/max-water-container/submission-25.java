class Solution {
    public int area(int h1, int h2, int x){
        int height = Math.min(h1,h2);
        return height * x;
    }
    public int maxArea(int[] h) {
        int l = 0;
        int r = h.length-1;
        int maxArea = area(h[l],h[r],r-l);
        while(l < r){
            if(h[l] < h[r]){
                l++;
                maxArea = Math.max(maxArea, area(h[l], h[r], r-l));
            }else{
                r--;
                maxArea = Math.max(maxArea, area(h[l], h[r], r-l));
            }
        }
            maxArea = Math.max(maxArea, area(h[l], h[r], r-l));
            return maxArea;
    
    }
}
