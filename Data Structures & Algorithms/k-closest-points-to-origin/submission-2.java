class Solution {
    public static class Pair{
        int first;
        int second;
        public Pair(int first, int second){
            this.first = first;
            this.second = second;
        }
    }
    public int[][] kClosest(int[][] points, int k) {
        Pair [] distanceArr = new Pair [points.length];
        Queue<Pair>maxHeap = new PriorityQueue<>((a, b) -> Integer.compare(a.second, b.second));
        for(int i=0;i<points.length;i++){
            int [] pts = points[i];
            int dist = pts[0]*pts[0] + pts[1]*pts[1];
            Pair p = new Pair(i, dist);
            distanceArr[i] = p;
            maxHeap.add(distanceArr[i]);
        }


        int [][] resp = new int [k][2];

        for(int i=0;i<k;i++){
            Pair p = maxHeap.poll();
            int index = p.first;
            int [] point = points[index];
            resp[i] = point;
        }
        return resp;
    }
}
