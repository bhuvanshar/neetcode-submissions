class MinStack {
Stack<Integer>stack;
    public MinStack() {
        this.stack = new Stack<>();
    }
    
    public void push(int val) {
        this.stack.push(val);
    }
    
    public void pop() {
        this.stack.pop();
    }
    
    public int top() {
        return this.stack.peek();
    }
    
    public int getMin() {
        Stack<Integer> minStack = new Stack<>();
        int min = Integer.MAX_VALUE;
        while(!this.stack.isEmpty()){
            int val = this.stack.pop();
            min = Math.min(min, val);
            minStack.push(val);
        }
        while(!minStack.isEmpty()){
            int val = minStack.pop();
            this.stack.push(val);
        }
        return min;
    }
}
