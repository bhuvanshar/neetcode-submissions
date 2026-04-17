class Solution {
    class Pair{
        public int num;
        public int freq;
        public Pair(int num, int freq){
            this.num = num;
            this.freq = freq;
        }
    }
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Pair> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int n = nums[i];
            map.computeIfAbsent(nums[i], kt->new Pair(n,1)).freq++;
        }

        Queue<Pair> pq = new PriorityQueue<>((a,b)->Integer.compare(b.freq, a.freq));

        for(Map.Entry<Integer, Pair> m : map.entrySet()){
            pq.offer(m.getValue());
        }

        int [] res = new int [k];
        for(int i=0;i<k;i++){
            res[i] = pq.poll().num;
        }

        return res;
    }
}
