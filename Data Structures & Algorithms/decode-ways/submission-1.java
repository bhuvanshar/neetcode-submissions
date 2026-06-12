class Solution {
    public int numDecodings(String s) {
        int [] memo = new int [s.length()];
        Arrays.fill(memo, -1);
        return mem(s, 0, memo);
        // return solve(s, 0);
    }

    public int solve(String s, int i){
        if(i == s.length())return 1;
        if(s.charAt(i) == '0')return 0;

        int one = solve(s, i+1);

        int two = 0;

        if(i+1 < s.length()){
            int num = Integer.parseInt(s.substring(i, i+2));
            if(num >= 10 && num <= 26){
                two = solve(s, i+2);
            }
        }
        return one + two;
    }

    public int mem(String s, int i, int [] memo){
        if(i == s.length())return 1;
        if(s.charAt(i) == '0')return 0;

        if(memo[i] != -1)return memo[i];

        int one = mem(s, i+1, memo);

        int two = 0;
        if(i+1 < s.length()){
            int num = Integer.parseInt(s.substring(i,i+2));
            if(num >= 10 && num <= 26){
                two = mem(s, i+2, memo);
            }
        }
        return memo[i] = one + two;
    }
}
