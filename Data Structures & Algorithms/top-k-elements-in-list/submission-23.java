public class Pair{
        int num;
        int freq;
        public Pair(int num, int freq){
            this.num = num;
            this.freq = freq;
        }
    }
class Solution {
    
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i], map.getOrDefault(nums[i],0) + 1);
        }
        Queue<Pair> queue = new PriorityQueue<>((b,a)->Integer.compare(a.freq, b.freq));
        for(Map.Entry<Integer, Integer> m : map.entrySet()){
            Pair p = new Pair(m.getKey(), m.getValue());
            queue.offer(p);
        }
        int v = 0;
        int [] res = new int [k];
        while(v < k){
            res[v] = queue.poll().num;
            v++;
        }
        return res;
    }
}
