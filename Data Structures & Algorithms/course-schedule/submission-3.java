class Solution {
    public boolean khanAlgo(List<List<Integer>> adj, int V){
        int [] inDegree = new int [V];
        for(int i=0;i<V;i++){
            for(int nbr : adj.get(i)){
                inDegree[nbr]++;
            }
        }
        Queue<Integer> queue = new LinkedList<>();
        for(int i=0;i<V;i++){
            if(inDegree[i] == 0){
                queue.offer(i);
            }
        }
        List<Integer> res = new ArrayList<>();
        while(!queue.isEmpty()){
            int node = queue.poll();
            res.add(node);
            for(int nbr : adj.get(node)){
                inDegree[nbr]--;
                if(inDegree[nbr] == 0){
                    queue.offer(nbr);
                }
            }
        }
        if(res.size() == V){
            return true;
        }else return false;
    }
    public boolean canFinish(int n, int[][] p) {
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int [] pre : p){
            int u = pre[0];
            int v = pre[1];
            adj.get(u).add(v);
        }
        return khanAlgo(adj, n);
    }
}
