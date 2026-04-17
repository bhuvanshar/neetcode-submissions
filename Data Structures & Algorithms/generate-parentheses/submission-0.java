class Solution {
    public List<String>res = new ArrayList<>();
    public String getStringFromStack(Stack<String> st){
        StringBuilder s = new StringBuilder();
        for(String ss : st){
            s.append(ss);
        }
        return s.toString();
    }

    public void backtrack(int open, int close, Stack<String> st,int n){

        if(open == n && close == n){
            String str = getStringFromStack(st);
            res.add(str);
            return;
        }

        if(open < n){
        st.push("(");
        backtrack(open +1, close, st,n);
        st.pop();
        }
        if(close < open){
        st.push(")");
        backtrack(open, close+1, st,n);
        st.pop();
        }
    }

    public List<String> generateParenthesis(int n) {
        Stack<String> st = new Stack<>();
        backtrack(0,0,st,n);
        return res;
    }
}
