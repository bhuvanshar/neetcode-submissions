class MinStack {
    private Stack<Integer>st;
    public MinStack() {
        st = new Stack<>();
    }
    
    public void push(int val) {
        st.push(val);
    }
    
    public void pop() {
        st.pop();
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        int min = Integer.MAX_VALUE;
        Stack<Integer>temp = new Stack<>();
        while(!st.isEmpty()){
            if(st.peek() < min)
            min = st.peek();
            temp.push(st.pop());

        }
        while(!temp.isEmpty()){
            st.push(temp.pop());
        }
        return min;
    }
}
