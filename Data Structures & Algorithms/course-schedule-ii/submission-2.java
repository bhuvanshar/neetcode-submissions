class Solution {
    public int[] khanAlgo(int [][] edges, int V){
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }

        for(int [] edge : edges){
            int u = edge[0];
            int v = edge[1];
            adj.get(u).add(v);
        }

        int [] inDegree = new int [V];
        for(int i=0;i<V;i++){
            for(int nbr : adj.get(i)){
                inDegree[nbr]++;
            }
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<V;i++){
            if(inDegree[i] == 0){
                q.offer(i);
            }
        }
        List<Integer> toposort = new ArrayList<>();
        while(!q.isEmpty()){
            int node = q.poll();
            toposort.add(node);
            for(int nbr : adj.get(node)){
                inDegree[nbr]--;
                if(inDegree[nbr] == 0){
                    q.offer(nbr);
                }
            }
        }
        if(toposort.size() != V){
            return new int []{};
        }
        int [] result = new int [toposort.size()];
        Collections.reverse(toposort);

        for(int i=0;i<V;i++){
            result[i] = toposort.get(i);
        }
        return result;
    }
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        return khanAlgo(prerequisites, numCourses);
    }
}
