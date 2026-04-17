class Solution {
    public int lastStoneWeight(int[] stones) {
        Queue<Integer>q = new PriorityQueue<>((a,b)->Integer.compare(b,a));
        for(int i : stones){
            q.offer(i);
        }
        while(q.size()!=1 && !q.isEmpty()){
            int a = q.poll();
            int b = q.poll();
            int res = Math.abs(a-b);
            if(res == 0)continue;
            q.offer(res);
        }
        if(q.isEmpty()){
            return 0;
        }else{
            return q.poll();
        }
    }
}
