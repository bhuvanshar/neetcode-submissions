class Solution {
        public static class PairInterval{
        int count;
        int interval;
        public PairInterval(int count, int interval){
            this.count = count;
            this.interval = interval;
        }
    }
    public int leastInterval(char[] tasks, int n) {
        Map<Character, Integer>map = new HashMap<>();
        for(int i=0;i<tasks.length;i++){
            map.put(tasks[i], map.getOrDefault(tasks[i],0)+1);
        }
        Queue<Integer>heap = new PriorityQueue<>((a,b)->Integer.compare(b,a));

        for(Map.Entry<Character, Integer> m : map.entrySet()){
            heap.add(m.getValue());
        }

        Queue<PairInterval>q = new ArrayDeque<>();
        int time = 0;
        while(!heap.isEmpty() || !q.isEmpty()){
            time++;
            if(!q.isEmpty() && q.peek().interval <= time){
                heap.add(q.poll().count);
            }
            if(!heap.isEmpty()){
                int cnt = heap.poll()-1;
                if(cnt > 0)
                    q.add(new PairInterval(cnt, time + n + 1));
            }
        }
        return time;
    }
}
