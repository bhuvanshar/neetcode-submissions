class Solution {
    public int countComponents(int n, int[][] edges) {
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int [] e : edges){
            int u = e[0];
            int v = e[1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        int count = 0;
        Set<Integer> vis = new HashSet<>();
        for(int i=0;i<n;i++){
            if(!vis.contains(i)){
                dfs(adj, i, vis);
                count++;
            }
        }
        return count;
    }
    public void dfs(List<List<Integer>> adj, int node, Set<Integer> vis){
        vis.add(node);
        for(int nbr : adj.get(node)){
            if(!vis.contains(nbr)){
                dfs(adj, nbr, vis);
            }
        }
    }
}
