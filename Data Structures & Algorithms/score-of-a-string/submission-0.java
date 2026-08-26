class Solution {
    public int scoreOfString(String s) {
        int nxt = 1;
        int sum = 0;
        for(int i=0;i<s.length()-1;i++){
            int curr = (int)(s.charAt(i));
            int next = (int)(s.charAt(nxt));
            nxt++;
            sum+=Math.abs(next - curr);
        }
        return sum;
    }
}