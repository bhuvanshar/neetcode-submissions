class Solution {
    public static class Pair{
        int number;
        int freq;
        public Pair(int number, int freq){
            this.number = number;
            this.freq = freq;
        }
    }
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Pair>map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                Pair p = map.get(nums[i]);
                p.freq++;
                map.put(nums[i], p);
            }else{
                Pair p = new Pair(nums[i], 1);
                map.put(nums[i], p);
            }
        }
        Queue<Pair> qp = new PriorityQueue<>((a,b)->Integer.compare(b.freq,a.freq));
        for(Map.Entry<Integer, Pair> m : map.entrySet()){
            qp.offer(m.getValue());
        }
        int i = 0;
        int [] res = new int [k];
        while(i < k){
            res[i] = qp.poll().number;
            i++;
        }
        return res;
    }
}
