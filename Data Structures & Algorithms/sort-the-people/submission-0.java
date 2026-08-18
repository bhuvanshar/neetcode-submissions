class Solution {
    public class Pair{
        String name;
        int height;
        public Pair(String name, int height){
            this.name = name;
            this.height = height;
        }
    }
    public String[] sortPeople(String[] names, int[] heights) {
        // Pair [] pl = new Pair [names.length];
        Queue<Pair> pq = new PriorityQueue<>((a,b)->Integer.compare(b.height, a.height));
        for(int i=0;i<names.length;i++){
            // pl[i] = new Pair(names[i], height[i]);
            pq.offer(new Pair(names[i], heights[i]));
        }
        String [] res = new String [pq.size()];
        int i = 0;
        while(!pq.isEmpty()){
            Pair p = pq.poll();
            res[i] = p.name;
            i++;
        }
        return res;
    }
}