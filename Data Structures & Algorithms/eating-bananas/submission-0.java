class Solution {
    int hours(int [] piles, int t){
        int sum = 0;
        for(int i=0;i<piles.length;i++){
            sum+=(int)Math.ceil((double)piles[i]/t);
        }
        return sum;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int max = 0;
        for(int i=0;i<piles.length;i++){
            max = Math.max(max, piles[i]);
        }
        int l = 1;
        int r = max;
        while(l <= r){
            int mid = l + (r-l)/2;
            int need = hours(piles, mid);
            if(need > h){
                l = mid+1;
            }else{
                r = mid-1;
        }
        }
        return l;
    }
}
