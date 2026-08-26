class Solution {
    public String largestGoodInteger(String num) {
        int left = 0;
        int right = 2;
        int max = Integer.MIN_VALUE;
        String smax = "";
        while(right < num.length()){

            String s = num.substring(left, right+1);

            if(!(s.charAt(0) == s.charAt(1) && s.charAt(1) == s.charAt(2))){
                left++;
                right++;
                continue;
            }else{
                int number = Integer.parseInt(s);
                max = Math.max(max, number);
                if(number >= max){
                    smax = s;
                }
            }

            left++;
            right++;
        }
        return smax;
    }
}