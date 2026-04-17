class Solution {
    public int lastStoneWeight(int[] stones) {
        Queue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0; i<stones.length;i++){
            q.add(stones[i]);
        }

        while(q.size() > 1){
            int a = q.poll();
            int b = q.poll();
            if(a != b)
            q.add(a-b);
        }
        if(q.size() ==1)
        return q.peek();
        else{
            return 0;
        }
    }
}
