class Solution {
    public static class Pair{
        int [] point;
        int distance;
        Pair(int [] point, int distance){
            this.point = point;
            this.distance = distance;
        }
    }
    public int[][] kClosest(int[][] points, int k) {
        Pair [] distanceArr = new Pair [points.length];
        for(int i=0;i<points.length;i++){
            int x = points[i][0];
            int y = points[i][1];
            int distance = x*x + y*y;
            distanceArr[i] = new Pair(new int[]{points[i][0], points[i][1]}, distance);
        }

        Queue<Pair>q = new PriorityQueue<>((a,b)->Integer.compare(a.distance, b.distance));
        for(Pair p : distanceArr){
            q.offer(p);
        }
        int i = 0;
        int [][] res = new int [k][2];

        while(i<k){
            res[i] = q.poll().point;
            i++;
        }

        return res;
    }
}
