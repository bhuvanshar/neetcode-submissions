class Solution {
    public int[] dailyTemperatures(int[] t) {
        int n = t.length;
        int [] res = new int [n];
        Stack<int []> stack = new Stack<>();

        for(int i=0;i<n;i++){
            int temp = t[i];
            while(!stack.isEmpty() && temp > stack.peek()[0]){
                int [] pair = stack.pop();
                res[pair[1]] = i-pair[1];
            }
            stack.push(new int []{temp, i});
        }
        return res;
    }
}
