class Solution {
    public List<Integer> khanAlgo(List<List<Integer>>adj, int V){
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
        if(res.size() != V)return new ArrayList<>();
        else return res;
    }
    
    // public boolean canFinish(int numCourses, int[][] prerequisites) {
        
    // }
    public int[] findOrder(int numCourses, int[][] prerequisites) {
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
        List<Integer> res = khanAlgo(adj, n);
        if(res.size() == 0)return new int[0];
        int [] result = new int [n];
        for(int i =0;i<n;i++){
            result[i] = res.get(i);
        }
        return result;
    }
}
