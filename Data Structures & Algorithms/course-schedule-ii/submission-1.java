class Solution {
    public List<Integer> khanAlgo(List<List<Integer>>adj, int V){
        Set<Integer> visited = new HashSet<>();
        int [] inDegree = new int [V];
        Queue<Integer> queue = new LinkedList<>();
        for(int i=0;i<V;i++){
            for(int nbr : adj.get(i)){
                inDegree[nbr]++;
            }
        }
        for(int i=0;i<V;i++){
            if(inDegree[i] == 0){
                queue.offer(i);
            }
        }
        List<Integer>res = new ArrayList<>();
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
        if(res.size() == V)return res;
        else return new ArrayList<>();
    }

    public int[] findOrder(int n, int[][] p) {
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int [] pre : p){
            int u = pre[0];
            int v = pre[1];
            adj.get(u).add(v);
        }
        List<Integer> res = khanAlgo(adj, n);
        int [] r = new int [n];
        int x = 0;

        for(int i=res.size()-1;i>=0;i--){
            r[x] = res.get(i);
            x++;
        }
        return res.size() == n ? r : new int []{};
    }
}
