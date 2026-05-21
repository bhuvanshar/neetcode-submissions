class Solution {

    public boolean validTree(int V, int[][] edges){
		List<List<Integer>> adj = new ArrayList<>();
		for(int i=0;i<V;i++){
			adj.add(new ArrayList<>());
		}
		for(int [] edge : edges){
			int u = edge[0];
			int v = edge[1];
			adj.get(u).add(v);
			adj.get(v).add(u);
		}
		Set<Integer> visited = new HashSet<>();
		if(hasCycle(adj, 0, -1, visited)){
			return false;
		}

		if(visited.size() != V){
			return false;
		}
		return true;
	}

	public static boolean hasCycle(List<List<Integer>> adj, int node, int parent, Set<Integer>visited){
		visited.add(node);

		for(int nbr : adj.get(node)){
			if(!visited.contains(nbr)){
				if(hasCycle(adj, nbr, node, visited))return true;
			}else if(nbr != parent){
				return true;
			}
		}
		return false;
	}
}
