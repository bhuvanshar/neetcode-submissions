class Solution {
    public static class Pair{
        public int number;
        public int freq;
        public Pair(int number, int freq){
            this.number = number;
            this.freq = freq;
        }
    }
    public int[] topKFrequent(int[] nums, int k) {
        Queue<Pair> pq = new PriorityQueue<>((a,b)->Integer.compare(b.freq, a.freq));
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i], map.getOrDefault(nums[i],0) + 1);
        }
        for(Map.Entry<Integer, Integer> m : map.entrySet()){
            Pair p = new Pair(m.getKey(), m.getValue());
            pq.offer(p);
        }
        int i=0;
        int [] res = new int [k];
        while(i<k){
            res[i] = pq.poll().number;
            i++;
        }
        return res;
    }
}
