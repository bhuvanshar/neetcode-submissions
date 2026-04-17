class Solution {
        public int timeToEat(int [] arr, int rate){
        double time = 0.0;

        for(int i=0;i<arr.length;i++){
            double t = arr[i];
            double r = rate;
            time += Math.ceil(t/r);
        }
        return (int)time;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int max = 0;
        for(int x : piles){
            max = Integer.max(max, x);
        }
        int l = 1;
        int r = max;
        while(l <= r){
            int mid = l + (r-l)/2;
            if(timeToEat(piles, mid) <= h){
                r = mid-1;
            }else {
                l = mid+1;
            }
        }
        return l;
    }
}
