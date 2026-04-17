class Solution {
    public class Pair{
        public int number;
        public int freq;
        public Pair(int number, int freq){
            this.number = number;
            this.freq = freq;
        }
    }
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Pair> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                Pair p = map.get(nums[i]);
                p.freq++;
                map.put(nums[i], p);
            }else{
                map.put(nums[i], new Pair(nums[i], 1));
            }
        }
        Queue<Pair> pq = new PriorityQueue<>((a,b)->Integer.compare(b.freq, a.freq));

        for(Map.Entry<Integer, Pair> m : map.entrySet()){
            pq.offer(m.getValue());
        }

        int [] res = new int [k];

        for(int i=0;i<k;i++){
            res[i] = pq.poll().number;
        }
        return res;
    }
}
