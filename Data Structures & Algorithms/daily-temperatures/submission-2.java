class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] res = new int[temperatures.length];

        for(int l=0;l<temperatures.length;l++){
            int cnt = 1;
            for(int r = l+1; r<temperatures.length; r++){
                if(temperatures[l] >= temperatures[r]){
                    cnt++;
                }else{
                    res[l] = cnt;
                    break;
                }
            }
        }
        return res;
    }
}
