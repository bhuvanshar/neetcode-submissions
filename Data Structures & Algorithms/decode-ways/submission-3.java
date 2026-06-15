class Solution {
    public int numDecodings(String s) {
        if(s.length() == 0)return 0;
        int n = s.length();
        int [] memo = new int [n+1];
        Arrays.fill(memo, -1);
        // return memo(s, 0, memo);
        return tab(s);
    }

    public int solve(String s, int i){
        if(i >= s.length())return 1;

        if(s.charAt(i) == '0')return 0;

        int oneNum = solve(s, i+1);
        int twoNum = 0;

        if(i+1 < s.length()){
            int num = Integer.parseInt(s.substring(i, i+2));
            if(num <=26 && num >=10){
                twoNum = solve(s,i+2);
            }
        }
        return oneNum + twoNum;
    }
    public int memo(String s, int i, int [] memo){
        if(i >= s.length())return 1;
        if(s.charAt(i) == '0')return 0;
        if(memo[i] != -1)return memo[i];

        int one = memo(s, i+1, memo);
        int two = 0;
        if(i+1 < s.length()){
            int num = Integer.parseInt(s.substring(i, i+2));
            if(num <= 26 && num >= 0){
                two = memo(s, i+2, memo);
            }
        }
        return memo[i] = one + two;
    }
    public int tab(String s){
        int n = s.length();
        int [] dp = new int [n+1];
        dp[n] = 1;
        for(int i = n-1; i>=0; i--){
            if(s.charAt(i) == '0'){
                dp[i] = 0;
            }else{
                dp[i] = dp[i+1];
                if(i+1 < s.length()){
                    int num = Integer.parseInt(s.substring(i, i+2));
                    if(num <= 26 && num >= 10){
                        dp[i] = dp[i] + dp[i+2];
                    }
                }
            }
        }
        return dp[0];
    }
}
