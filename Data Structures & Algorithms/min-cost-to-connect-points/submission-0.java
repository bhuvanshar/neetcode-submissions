class Solution {
    public int prims(List<List<int[]>>adj, int V){
        Queue<int[]> queue = new PriorityQueue<>((a,b)->Integer.compare(a[0],b[0]));
        queue.offer(new int []{0,0});
        boolean [] inMST = new boolean[V];
        int totalWeight = 0;
        int edgesUsed = 0;
        
        while(!queue.isEmpty()){
            int [] curr = queue.poll();
            int u = curr[1];
            int w = curr[0];
            if(inMST[u])continue;
            inMST[u] = true;
            edgesUsed++;
            totalWeight += w;
            for(int [] nbr : adj.get(u)){
                int vw = nbr[1];
                int v = nbr[0];
                if(!inMST[v]){
                    queue.offer(new int []{vw, v});
                }
            }
        }
        return totalWeight;
    }
    public int manhattanDist(int [] x, int [] y){
        int xi = x[0];
        int xj = y[0];
        int yi = x[1];
        int yj = y[1];
        return Math.abs(xi-xj) + Math.abs(yi-yj);
    }
    public int minCostConnectPoints(int[][] points) {
        int n = points.length;
        List<List<int[]>> adj = new ArrayList<>();

        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int w = manhattanDist(points[i], points[j]);
                adj.get(i).add(new int []{j, w});
                adj.get(j).add(new int []{i, w});
            }
        }
        return prims(adj, n);
    }
}
