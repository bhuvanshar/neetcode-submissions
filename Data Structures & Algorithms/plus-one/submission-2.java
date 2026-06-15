class Solution {
    public int[] plusOne(int[] digits) {
        int carry = 0;
        int last = digits[digits.length-1] + 1;
        if(last == 10){
            int i = digits.length-1;
            while(i >= 0 && digits[i] == 9){
                digits[i] = 0;
                i--;
                System.out.println(i);
            }
            if(i < 0){
                int [] res = new int [digits.length+1];
                res[0] = 1;
                return res;
            }else{
                System.out.println(i);
                digits[i]++;
                return digits;
            }
        }else{
            digits[digits.length-1] = last;
        }
        return digits;
    }
}
