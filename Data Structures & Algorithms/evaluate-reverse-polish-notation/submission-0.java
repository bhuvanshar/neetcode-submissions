class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> stack = new Stack<>();
            for(String tkn : tokens){
                switch (tkn){
                    case "+":
                        stack.push(Integer.toString(Integer.parseInt(stack.pop())+Integer.parseInt(stack.pop())));
                        break;
                    case "-": {
                        String a = stack.pop();
                        String b = stack.pop();
                        stack.push(Integer.toString(Integer.parseInt(b) - Integer.parseInt(a)));
                        break;
                    }

                    case "*":
                        stack.push(Integer.toString(Integer.parseInt(stack.pop()) * Integer.parseInt(stack.pop())));
                        break;
                    case "/":
                    {
                        String a = stack.pop();
                        String b = stack.pop();
                        stack.push(Integer.toString(Integer.parseInt(b) / Integer.parseInt(a)));
                        break;
                    }
                    default:
                        stack.push(tkn);
                        break;
                }
            }
            return Integer.parseInt(stack.elementAt(0));
    }
}
