class Solution {

    public static class Pair{
        public int index;
        public int number;
        public int n;
        public Pair(){
            this.index = 0;
            this.number = 0;
            this.n = Integer.MIN_VALUE;
        }
        public Pair(int number, int n){
//            this.index = index;
            this.number = number;
            this.n = n;
        }
    }
    public int[] topKFrequent(int[] nums, int k) {
        if(nums.length == 0){
            return new int [k];
        }
    PriorityQueue<Pair> pq = new PriorityQueue<>((a,b)->Integer.compare(b.number,a.number));
        Map<Integer, Integer>map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }

        for(Map.Entry<Integer, Integer>entry : map.entrySet()){
            Pair p = new Pair(entry.getValue(), entry.getKey());
            pq.add(p);
        }
        int [] res = new int [k];

        for(int i=0;i<k;i++){
            res[i] = pq.poll().n;
        }
        return res;
       }
}
