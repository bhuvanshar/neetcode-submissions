class Solution {
    public int specialArray(int[] nums) {
        Queue<Integer> pq = new PriorityQueue<>();
        for(int n : nums){
            pq.offer(n);
        }
int prev =-1;
        while(!pq.isEmpty()){
             int x = pq.size();

            if (pq.peek() >= x && prev < x) {

                return x;

            }

            prev = pq.poll();
        }
        return -1;
    }
}