class Solution {
    public class Pair{
        public int number;
        public int frequency;
        public Pair(int number, int frequency){
            this.number = number;
            this.frequency = frequency;
        }
    }
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        List<Pair> lp = new ArrayList<>();
        Queue<Pair> qp = new PriorityQueue<>((a,b)->Integer.compare(b.frequency,a.frequency));
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            Pair p = new Pair(entry.getKey(), entry.getValue());
            qp.offer(p);
        }

        int [] res = new int [k];

        int i = 0;
        while(i < k){
            res[i] = qp.poll().number;
            i++;
        }
        return res;
    }
}
