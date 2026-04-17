class Solution {
    public int reverseBits(int n) {
        StringBuilder st = new StringBuilder();
        int i=0;
        while(i<32){
            if((1<<i & n) != 0){
                st.append("1");
            }else{
                st.append("0");
            }
            i++;
        }

        String str = st.reverse().toString();
        int res = 0;
        for(int x=0;x<str.length();x++){
            if(str.charAt(x) == '1'){
                res|=(1<<x);
            }
        }
        return res;
    }
}
