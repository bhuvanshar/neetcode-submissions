class Solution {
    public int area(int leftH, int rightH, int b){
        int max = Math.min(leftH, rightH);
        return b*max;
    }
    public int maxArea(int[] h) {
        int l = 0;
        int r = h.length-1;
        int ar = area(h[l], h[r], r-l);
        int maxArea = ar;
        while(l < r){
            if(h[l] < h[r]){
                l++;
            }else{
                r--;
            }
            ar = area(h[l], h[r], r-l);
            maxArea = Math.max(maxArea, ar);
        }
        maxArea = Math.max(maxArea, ar);
        return maxArea;
    }
}
