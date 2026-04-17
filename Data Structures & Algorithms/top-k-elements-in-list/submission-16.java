class Solution {
    public class Pair{
        int num;
        int freq;
        public Pair(int num, int freq){
            this.num = num;
            this.freq = freq;
        }
    }
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Pair>map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                Pair p = map.get(nums[i]);
                p.freq++;
                map.put(nums[i],p);
            }else{
                Pair p = new Pair(nums[i], 1);
                map.put(nums[i],p);
            }
        }
        Queue<Pair> q = new PriorityQueue<>((a,b)->Integer.compare(b.freq,a.freq));
        for(Map.Entry<Integer, Pair> m : map.entrySet()){
            q.offer(m.getValue());
        }
        int [] res = new int [k];
        int i=0;
        while(i<k){
            res[i] = q.poll().num;
            i++;
        }
        return res;
    }
}
