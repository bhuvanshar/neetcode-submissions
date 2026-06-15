class Solution {
    public int squareCal(int n){
        int sum = 0;
        while(n >= 10){
        int dig = n%10;
        n = n/10;
        sum +=(dig * dig);}
        sum += n*n;
        return sum;
    }
    public boolean isHappy(int n) {
        n = squareCal(n);
        if(n == 1){
            return true;
        }
        if(n > 1 && n <= 9)return false;
        return isHappy(n);
    }
}
