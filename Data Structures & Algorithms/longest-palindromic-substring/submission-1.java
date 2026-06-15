class Solution {
    public String longestPalindrome(String s) {
        String res = "";
        int resLen = 0;

        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                int l = i;
                int r = j;
                while(l < r && s.charAt(l) == s.charAt(r)){
                    l++;
                    r--;
                }
                if(l >= r && resLen < (j-i+1)){
                    resLen = j-i+1;
                    res = s.substring(i, j+1);
                }
            }
        }
        return longestPalindromeDP(s);
    }
    public String longestPalindromeDP(String s){
        int resIndx = 0;
        int resLen = 0;
        int n = s.length();

        boolean [][] dp = new boolean [n][n];

        for(int i=n-1;i>=0;i--){
            for(int j=i;j<n;j++){
                if(s.charAt(i) == s.charAt(j) && (j-i <= 2 || dp[i+1][j-1])){
                    dp[i][j] = true;
                    if(resLen < j-i+1){
                        resIndx = i;
                        resLen = j-i+1;
                    }
                }
            }
        }
        return s.substring(resIndx, resIndx+resLen);
    }

}
