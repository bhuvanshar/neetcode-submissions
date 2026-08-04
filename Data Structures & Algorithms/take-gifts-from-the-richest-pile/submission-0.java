class Solution {
    public long pickGifts(int[] gifts, int k) {
        Queue<Integer> pq = new PriorityQueue<>((a,b)->Integer.compare(b,a));
        for(int g : gifts){
            pq.offer(g);
        }

        int second = 0;
        while(second<k){
            int max = pq.poll();
            max = (int)Math.floor(Math.sqrt(max));
            pq.offer(max);
            second++;
        }
        int sum = 0;
        while(!pq.isEmpty()){
            sum+= pq.poll();
        }
        return sum;
    }
}