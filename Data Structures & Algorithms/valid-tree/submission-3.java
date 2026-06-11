class Solution {
    public boolean validTree(int n, int[][] edges) {
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int [] edge : edges){
            int u = edge[0];
            int v = edge[1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        Set<Integer> vis = new HashSet<>();
        if(hasCycle(adj, vis, 0, -1)){
            return false;
        }
        if(vis.size() != n){
            return false;
        }
        return true;
    }
    public boolean hasCycle(List<List<Integer>> adj, Set<Integer>vis, int src, int parent){
        vis.add(src);
        for(int nbr : adj.get(src)){
            if(!vis.contains(nbr)){
                if(hasCycle(adj, vis, nbr, src))return true;
            }
            else if(nbr != parent)return true;
        }
        return false;
    }
}
