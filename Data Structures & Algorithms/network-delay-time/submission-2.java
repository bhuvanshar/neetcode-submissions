class Solution {
    public int [] dist(List<List<int[]>>adj, int src, int V){
        int [] dist = new int [V];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;

        Queue<int []> queue = new PriorityQueue<>((a,b)->Integer.compare(a[0],b[0]));

        queue.add(new int []{0,src});

        while(!queue.isEmpty()){
            int [] curr = queue.poll();
            int u = curr[1];
            int w = curr[0];
            if(dist[u] < w)continue;
            for(int [] m : adj.get(u)){
                int v = m[0];
                if(dist[v] > dist[u] + m[1]){
                    dist[v] = dist[u] + m[1];
                    queue.add(new int [] {dist[v],v});
                }
            }
        }
        return dist;

    }
    public int networkDelayTime(int[][] times, int n, int k) {
        List<List<int[]>>adj = new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int [] t : times){
            int u = t[0];
            int v = t[1];
            int w = t[2];
            adj.get(u-1).add(new int []{v-1,w});
        }
        int max = Integer.MIN_VALUE;
        int [] dist = dist(adj, k-1, n);
        for(int i : dist){
            if(i == Integer.MAX_VALUE)return -1;
            max = Math.max(max, i);
        }
        return max;
    }
}
