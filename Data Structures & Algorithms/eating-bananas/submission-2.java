class Solution {
    public int eatingTime(int [] arr, int rate){
        int sum = 0;
        for(int n : arr){
            double a = n;
            double b = rate;
            sum += Math.ceil(a/b);
        }
        return sum;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int maxRate = 0;
        for(int p : piles){
            maxRate = Math.max(maxRate, p);
        }
        int l = 1;
        int r = maxRate;
        while(l<=r){
            int mid = l + (r-l)/2;
            if(eatingTime(piles, mid) <= h){
                
                r = mid-1;
            }else {
                l = mid+1;
            }
        }
        return l;
    }
}
