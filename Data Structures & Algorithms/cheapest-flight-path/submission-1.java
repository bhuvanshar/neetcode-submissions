class Solution {
    public int bellmanford(int [][] edges, int V, int src, int dst, int k){
        int [] dist= new int [V];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;

        for(int i=0;i<=k;i++){
            int [] temp = Arrays.copyOf(dist, V);
            for(int [] edge : edges){
                int u = edge[0];
                int v = edge[1];
                int w = edge[2];
                if(dist[u] != Integer.MAX_VALUE && dist[u] + w < temp[v]){
                    temp[v] = dist[u] + w;
                }
            }
            dist = temp;
        }
        return dist[dst] == Integer.MAX_VALUE ? -1 : dist[dst];
    }
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        return bellmanford(flights, n, src, dst, k);
    }
}
