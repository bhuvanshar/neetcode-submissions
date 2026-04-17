class KthLargest {
public Queue<Integer> pq;
public int target;
    public KthLargest(int k, int[] nums) {
        this.target = k;
        this.pq = new PriorityQueue<>((a,b)->Integer.compare(b,a));
        for(int i : nums){
            this.pq.offer(i);
        }
    }
    
    public int add(int val) {
        this.pq.offer(val);
        int minVal = 0;
        Queue<Integer> pro = new PriorityQueue<>((a,b)->Integer.compare(b,a));
        pro.addAll(this.pq);
        for(int i=0;i<this.target; i++){
            if(!pro.isEmpty())
                minVal = pro.poll();
        }
        return minVal;
    }
}
