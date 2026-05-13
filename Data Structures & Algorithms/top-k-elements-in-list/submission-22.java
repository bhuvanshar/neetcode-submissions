class Solution {
    public static class Pair{
        int value;
        int frequency;
        public Pair(int value, int frequency){
            this.value = value;
            this.frequency = frequency;
        }
    }
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            frequencyMap.put(nums[i], frequencyMap.getOrDefault(nums[i],0) + 1);
        }
        Queue<Pair> pq = new PriorityQueue<>((a,b)->Integer.compare(b.frequency, a.frequency));
        for(Map.Entry<Integer, Integer>m : frequencyMap.entrySet()){
            Pair p = new Pair(m.getKey(), m.getValue());
            pq.offer(p);
        }
        int [] res = new int [k];

        int i = 0;
        while(i < k){
            res[i] = pq.poll().value;
            i++;
        }
        return res;
    }
}
