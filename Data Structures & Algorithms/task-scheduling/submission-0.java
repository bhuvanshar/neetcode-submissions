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
        Queue<Integer> maxHeap = new PriorityQueue<>((a,b)->Integer.compare(b,a));
        Map<Character, Integer>map = new HashMap<>();
        for(int i = 0;i<tasks.length;i++){
            map.put(tasks[i], map.getOrDefault(tasks[i],0)+1);
        }
        for(Map.Entry<Character, Integer>m : map.entrySet()){
            maxHeap.add(m.getValue());
        }

        Queue<PairInterval> q = new ArrayDeque<>();
        int time = 0;

        while(!maxHeap.isEmpty() || !q.isEmpty()){
            time++;
            if(!q.isEmpty() && q.peek().interval <= time){
                    maxHeap.add(q.poll().count);
                }
            if(!maxHeap.isEmpty()){
                int cnt = maxHeap.poll()-1;
                if(cnt > 0){
                    q.add(new PairInterval(cnt, time+n+1));
                }
            }
        }
        return time;
    }
}
