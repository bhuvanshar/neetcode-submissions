class Solution {
    public boolean isPalindrome(String s) {
        String str = s.replaceAll("[^A-Za-z0-9]","").trim().toLowerCase();

        int l = 0;
        int r = str.length()-1;
        while(l < r){
            if(str.charAt(l) == str.charAt(r)){
                l++;
                r--;
            }else{
                return false;
            }
        }
        return true;
    }
}
