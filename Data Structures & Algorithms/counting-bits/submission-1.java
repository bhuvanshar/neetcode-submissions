class Solution {
    public int count(int n){
        int count = 0;
        int i=0;
        while(i<32){
            if((1<<i & n) != 0){
                count++;
            }
            i++;
        }
        return count;
    }
    public int[] countBits(int n) {
        int [] result = new int[n+1];
        for(int i=0;i<=n;i++){
            result[i] = count(i);
        }
        return result;
    }
}
