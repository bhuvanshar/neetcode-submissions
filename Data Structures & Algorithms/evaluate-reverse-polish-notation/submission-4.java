class Solution {
    public int evalRPN(String[] tokens){
        Stack<String>st = new Stack<>();
        for(String token : tokens){
            switch (token){
                case "+":{
                    st.push(Integer.toString(Integer.parseInt(st.pop()) + Integer.parseInt(st.pop())));
                    break;
                }
                case "-":{
                    int a = Integer.parseInt(st.pop());
                    int b = Integer.parseInt(st.pop());
                    st.push(Integer.toString(b - a));
                    break;
                }
                case "*":{
                    int a = Integer.parseInt(st.pop());
                    int b = Integer.parseInt(st.pop());
                    st.push(Integer.toString(a*b));
                    break;
                }
                case "/":{
                    int a = Integer.parseInt(st.pop());
                    int b = Integer.parseInt(st.pop());
                    int res = b/a;
                    st.push(Integer.toString(res));
                    break;
                }
                default:{
                    st.push(token);
                    break;
                }
            }
        }
        if(st.isEmpty())return 0;
        return Integer.parseInt(st.pop());
    }
}
