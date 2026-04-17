class Solution {
    public int totalTime(int [] piles, int time){
        int sum = 0;
        for(int i=0;i<piles.length;i++){
            sum+=(int)Math.ceil((double)piles[i]/time);
        }
        return sum;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int max = 0;
        for(int i=0;i<piles.length;i++){
            max = Math.max(max, piles[i]);
        }
        int r = max;
        int l = 1;
        while(l<=r){
            int mid = l + (r-l)/2;
            int t = totalTime(piles, mid);
            if(t > h){
                l = mid+1;
            }else{
                r = mid-1;
            }
        }
        return l;
    }
}
