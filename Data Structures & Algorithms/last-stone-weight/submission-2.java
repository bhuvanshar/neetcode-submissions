class Solution {
    public int lastStoneWeight(int[] nums) {
        Stack<Integer>st = new Stack<>();
        for(int x : nums){
            st.push(x);
        }
        
       Queue<Integer>maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for(int x : nums){
            maxHeap.add(x);
        }
        while(!(maxHeap.isEmpty() || maxHeap.size() == 1)){
            int a = maxHeap.poll();
            int b = maxHeap.poll();
            int res = Math.abs(a-b);
            if(res == 0)continue;
            else{
                maxHeap.add(res);
            }
        }
        if(maxHeap.isEmpty()){
            return 0;
        }else {
            return maxHeap.peek();
        }
    }
}
