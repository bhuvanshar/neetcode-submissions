class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int [][] memo = new int [text1.length()+1][text2.length()+1];
        for(int [] m : memo){
            Arrays.fill(m, -1);
        }
        return mem(text1, text2, text1.length(), text2.length(), memo);
    }
    public int rec(String a, String b, int i, int j){
        if(i == 0 || j == 0)return 0;
        if(a.charAt(i-1) == b.charAt(j-1))return 1+rec(a,b,i-1, j-1);
        else {
            return Math.max(rec(a,b,i-1, j), rec(a,b,i,j-1));
        }
    }

    public int mem(String a, String b, int i, int j, int [][] memo){
        if(i == 0 || j == 0)return 0;
        if(memo[i][j] != -1)return memo[i][j];
        if(a.charAt(i-1) == b.charAt(j-1)){
            memo[i][j] = 1+mem(a,b,i-1, j-1, memo);
        }else{
            memo[i][j] = Math.max(mem(a,b,i,j-1, memo), mem(a,b,i-1,j, memo));
        }
        return memo[i][j];
    }
}
