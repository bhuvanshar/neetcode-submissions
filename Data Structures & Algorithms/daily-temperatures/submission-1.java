class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
         int left = 0;
            int right = 1;
            int len = 1;
            int i = 0;
            int[] result = new int[temperatures.length];
            while (right < temperatures.length) {
                int temp = temperatures[left];

                while (right < temperatures.length && temperatures[left] >= temperatures[right]) {
                    len++;
                    right++;
                    if(right == temperatures.length){
                        len = 0;
                    }
                }
                result[i] = len;
                // if(right == temperatures.length){
                //     break;
                // }
                left++;
                right = left + 1;
                len = 1;
                i++;
            }

            return result;
    }
}
