class Solution {
    public class Pair{
        int num;
        int index;
        public Pair(int index, int num){
            this.index = index;
            this.num = num;
        }
    }
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        Queue<Pair> pq = new PriorityQueue<>((a, b) -> {
            if (a.num == b.num) {
                return Integer.compare(a.index, b.index); // Sort by index if values are equal
            }
            return Integer.compare(a.num, b.num);         // Otherwise sort by value
        });
        for(int i = 0; i<nums.length;i++){
            pq.offer(new Pair(i, nums[i]));
        }

        int i = 0;
        while(i < k){
            Pair p = pq.poll();
            p.num = p.num * multiplier;
            pq.offer(p);
            i++;
        }
        while(!pq.isEmpty()){
            Pair ps = pq.poll();
            nums[ps.index] = ps.num;
        }
        return nums;
    }
}