class Solution {
    public int time(int [] piles, int rate){
        int t = 0;
        for(int i=0;i<piles.length;i++){
            double x = piles[i];
            double r = rate;
            t += Math.ceil(x/r);
        }
        return t;
    } 
    public int minEatingSpeed(int[] piles, int h) {
        int max = Integer.MIN_VALUE;
        for(int p : piles){
            max = Math.max(p,max);
        }
        int l = 1;
        int r = max;
        while(l <= r){
            int mid = l + (r-l)/2;
            if(time(piles, mid) <= h){
                r = mid-1;
            }else if(time(piles, mid) > h){
                l = mid + 1;
            }
        }
        return l;
    }
}
