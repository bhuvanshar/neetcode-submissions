class Solution {
    public int maxArea(int[] h) {
        int l  = 0;
        int r = h.length-1;
        int maxArea = 0;
        if(h.length == 0){
            return maxArea;
        }

        while(l < r){
            maxArea = Math.max(maxArea, Math.min(h[l], h[r]) * (r-l));

            if(h[l] < h[r]){
                l++;
            }else if(h[l] > h[r]){
                r--;
            }else{
                l++;
            }
        }
        return maxArea;
    }
}
