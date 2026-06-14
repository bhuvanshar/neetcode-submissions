class MinStack {
    Stack<Integer> stack;

    public MinStack() {
        stack = new Stack<>();
    }
    
    public void push(int val) {
        stack.add(val);
    }
    
    public void pop() {
        stack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        Stack<Integer> temp = new Stack<>();
        int min = Integer.MAX_VALUE;
        while(!stack.isEmpty()){
            int t = stack.pop();
            min = Math.min(min,t);
            temp.add(t);
        }
        while(!temp.isEmpty()){
            stack.add(temp.pop());
        }
        return min;
    }
}
