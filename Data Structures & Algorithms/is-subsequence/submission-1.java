class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0;
        int j = 0;
        int c = 0;
        while(c < t.length() && j < t.length() && i < s.length()){
            if(s.charAt(i) == t.charAt(j)){
                i++;
                j++;
                c++;
            }else{
                j++;
            }
        }
        return c == s.length();
    }
}