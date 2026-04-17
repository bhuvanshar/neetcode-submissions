class Solution {
    int timeTakenToEat(int [] arr, int rate){
        double r = rate;
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            double x = arr[i];
            sum += (int)Math.ceil(x/r);
        }
    return sum;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int max = 0;
        for(int p : piles){
            max = Math.max(max, p);
        }
        int l = 1;
        int r = max;
        while(l <= r){
            int mid = l+(r-l)/2;
            if(timeTakenToEat(piles, mid) <= h){
                r = mid-1;
            }else{
                l = mid+1;
            }
        }
        return l;
    }
}
