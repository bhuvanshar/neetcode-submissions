class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res= new ArrayList<>();
        StringBuilder temp = new StringBuilder();
        int open = 0, close = 0;
        solve(open, close, temp, res, n);
        return res;
    }

    public void solve(int open, int close,  StringBuilder temp, List<String> res, int n){
        if(open == n && close == n){
            res.add(new String(temp));
            return;
        }

        if(open < n){
            temp.append('(');
            solve(open+1,close, temp, res, n);
            temp.deleteCharAt(temp.length()-1);
        }
        if(close < open){
            temp.append(")");
            solve(open, close+1, temp, res, n);
            temp.deleteCharAt(temp.length()-1);
        }
    }
}
