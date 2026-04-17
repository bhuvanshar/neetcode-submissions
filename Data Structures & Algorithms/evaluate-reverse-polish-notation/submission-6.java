class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> stack = new Stack<>();
        for(String token : tokens){
            switch(token){
                case "+":{
                    int a = Integer.parseInt(stack.pop());
                    int b = Integer.parseInt(stack.pop());
                    stack.push(Integer.toString(a+b));
                    break;
                }case "-":{
                    int a = Integer.parseInt(stack.pop());
                    int b = Integer.parseInt(stack.pop());
                    stack.push(Integer.toString(b-a));
                    break;
                }case "*":{
                    int a = Integer.parseInt(stack.pop());
                    int b = Integer.parseInt(stack.pop());
                    stack.push(Integer.toString(a*b));
                    break;
                }case "/":{
                    int a = Integer.parseInt(stack.pop());
                    int b = Integer.parseInt(stack.pop());
                    stack.push(Integer.toString(b/a));
                    break;
                }default:{
                    stack.push(token);
                    break;
                }
            }
        }
        return Integer.parseInt(stack.pop());
    }
}
