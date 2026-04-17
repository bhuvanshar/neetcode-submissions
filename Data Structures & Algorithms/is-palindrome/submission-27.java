class Solution {
    public boolean isPalindrome(String s) {
        String t = s.replaceAll("[^A-Za-z0-9]", "");
        int l = 0;
        int r = t.length()-1;
        String tt = t.toLowerCase();
        while(l<=r){
            if(tt.charAt(l) == tt.charAt(r)){
                l++;
                r--;
            }else{
                return false;
            }
        }
        return true;
    }
}
