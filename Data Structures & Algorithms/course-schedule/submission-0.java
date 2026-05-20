class Solution {
    public boolean khanAlgo(List<List<Integer>>adj, int V){
        Set<Integer>visited = new HashSet<>();
        int [] inDegree = new int [V];
        List<Integer>res= new ArrayList<>();
        
        for(int i=0;i<V;i++){
            for(int nbr : adj.get(i)){
                inDegree[nbr]++;
            }
        }
        Queue<Integer> queue = new LinkedList<>();

        for(int i=0;i<V;i++){
            if(inDegree[i] == 0){
                queue.add(i);
            }
        }

        while(!queue.isEmpty()){
            int node = queue.poll();
            res.add(node);
            for(int nbr : adj.get(node)){
                inDegree[nbr]--;
                if(inDegree[nbr] == 0){
                    queue.add(nbr);
                }
            }
        }
        if(res.size() != V)return false;
        else return true;
    }
    
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adj = new ArrayList<>();
        int n = numCourses;
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int [] pre : prerequisites){
            int u = pre[0];
            int v = pre[1];
            adj.get(v).add(u);
        }
        return khanAlgo(adj, n);
    }
}
//b->a
//u->v