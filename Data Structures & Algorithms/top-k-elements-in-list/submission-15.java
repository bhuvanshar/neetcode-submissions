class Solution {
    public static class Pair{
        int first;
        int second;
        public Pair(int first, int second){
            this.first = first;
            this.second = second;
        }
    }
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i =0; i< nums.length;i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }
        Queue<Pair> q = new PriorityQueue<>((a,b)->Integer.compare(b.second,a.second));
        List<Pair> lp = new ArrayList<>();
        for(Map.Entry<Integer, Integer> m : map.entrySet()){
            Pair p = new Pair(m.getKey(), m.getValue());
            lp.add(p);
        }
        for(Pair p : lp){
            q.add(p);
        }
        int i=0;
        int [] res = new int [k];
        while(i<k){
            res[i] = q.poll().first;
            i++;
        }
        return res;
    }
}
