class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int l = 0;
        int r = 0;
        int [] res = new int [temperatures.length];
        for(int i=0;i<temperatures.length;i++){
            r = i;
            int days = 0;
            while(temperatures[i] >= temperatures[r]){
                r++;
                
                if(r < temperatures.length){
                    days = r-i;
                }else{
                    days = 0;
                    break;
                }
            }
            res[i] = days;
        }
        return res;
    }
}
