class Solution {
    public int trap(int[] h) {
        int maxleft = h[0];
        int maxright = h[h.length-1];
        int l = 0;
        int r = h.length-1;
        int sum = 0;
        while(l < r){
            if(maxleft < maxright){
                l++;
                maxleft = Math.max(maxleft, h[l]);
                sum+= maxleft-h[l];
            }else{
                r--;
                maxright = Math.max(maxright, h[r]);
                sum+= maxright-h[r];
            }
        }
        return sum;
    }
}
