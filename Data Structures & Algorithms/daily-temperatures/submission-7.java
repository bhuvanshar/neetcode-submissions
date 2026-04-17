class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
         int r = 0;
        int len = 0;
        int [] res = new int[temperatures.length];
        for(int i=0;i<temperatures.length;i++){
            r = i+1;
            while(r<temperatures.length){
                if(temperatures[r] <= temperatures[i]){
                }else{
                    len = r-i;
                    res[i] = len;
                    break;
                }
                r++;
            }
        }
        return res;
    }
}
