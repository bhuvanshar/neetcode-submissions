class Solution {
    public int countComponents(int n, int[][] edges) {
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
        Set<Integer> visited = new HashSet<>();
        int count = 0;
        for(int i=0;i<n;i++){
            if(!visited.contains(i)){
                dfs(adj, i, visited);
                count++;
            }
        }
        return count;
    }

    public void dfs(List<List<Integer>> adj, int node, Set<Integer> visited){
        visited.add(node);
        for(int nbr : adj.get(node)){
            if(!visited.contains(nbr)){
                dfs(adj, nbr, visited);
            }
        }
    }
}
