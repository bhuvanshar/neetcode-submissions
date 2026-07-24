class Solution {
    public int heightChecker(int[] heights) {
        Queue<Integer> pq = new PriorityQueue<>((a,b)->Integer.compare(a,b));
        for(int n : heights){
            pq.offer(n);
        }
        int c = 0;
        for(int h : heights){
            if(h != pq.poll())c++;
        }
        return c;
    }
}