class Solution {
    public int[] findRedundantConnection(int[][] edges) {
        int n = edges.length;
        int [] inDegree = new int [n+1];
        Queue<Integer>queue = new LinkedList<>();
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0;i<=n;i++)adj.add(new ArrayList<>());

        for(int [] edge : edges){
            int u = edge[0];
            int v = edge[1];
            adj.get(u).add(v);
            adj.get(v).add(u);
            inDegree[u]++;
            inDegree[v]++;
        }

        for(int i=1;i<=n;i++){
            if(inDegree[i] == 1){
                queue.offer(i);
            }
        }

        while(!queue.isEmpty()){
            int node = queue.poll();
            inDegree[node]--;
            for(int nbr : adj.get(node)){
                inDegree[nbr]--;
                if(inDegree[nbr] == 1){
                    queue.add(nbr);
                }
            }
        }
        for(int i= edges.length-1; i >=0 ;i--){
            int u = edges[i][0];
            int v = edges[i][1];
            if(inDegree[u] >0 && inDegree[v] > 0){
                return new int []{u,v};
            }
        }
        return new int [0];
    }
}
