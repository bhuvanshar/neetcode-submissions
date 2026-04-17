class MinStack {

    private Stack<Integer> stack;

    public int getMin(){
        Stack<Integer>st = new Stack<>();
        int min = Integer.MAX_VALUE;
        while(!stack.isEmpty()){
            min = Integer.min(min, stack.peek());
            st.push(stack.pop());
        }

        while(!st.isEmpty()){
            stack.push(st.pop());
        }
        return min;
    }

    public MinStack() {
        stack = new Stack<>();
    }
    
    public void push(int val) {
        stack.push(val);
    }
    
    public void pop() {
        stack.pop();
    }
    
    public int top() {
       return stack.peek();
    }
    

}
