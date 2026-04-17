class Solution {
    public int findKthLargest(int[] nums, int k) {
        Queue<Integer>q = new PriorityQueue(Collections.reverseOrder());
        for(int x : nums){
            q.offer(x);
        }
        int i = 0;
        while(i<k-1){
            q.poll();
            i++;
        }
        return q.peek();
    }
}
