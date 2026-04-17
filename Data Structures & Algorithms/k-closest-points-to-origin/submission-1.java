class Solution {
    public int[][] kClosest(int[][] points, int k) {
        
        int [][] distaneArr = new int [points.length][2];

        for(int i=0;i<points.length;i++){
            int d = points[i][0]*points[i][0] + points[i][1]*points[i][1];
            distaneArr[i][0] = i;
            distaneArr[i][1] =d;
        }

        Arrays.sort(distaneArr, (a,b)->Integer.compare(a[1],b[1]));

        int [][] res = new int [k][2];

        for(int i=0;i<k;i++){
            res[i] = points[distaneArr[i][0]];
        }

        return res;

    }
}
