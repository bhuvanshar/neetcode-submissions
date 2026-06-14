class Solution {
    public class Pair{
        int p;
        int s;
        double t;
        public Pair(int p, int s, double t){
            this.p = p;
            this.s = s;
            this.t = t;
        }
    }
    public int carFleet(int target, int[] position, int[] speed) {
        if(position.length == 0)return 0;
        Pair [] lp = new Pair[position.length];
        for(int i=0;i<position.length;i++){
            Pair pair = new Pair(position[i], speed[i],(double)(target-position[i])/speed[i]);
            lp[i] = pair;
        }
        Arrays.sort(lp, (a,b)->Integer.compare(a.p,b.p));
        double track = lp[lp.length-1].t;
        int c = 1;
        for(int i= lp.length-2; i>= 0; i--){
            if(lp[i].t <= track){
                continue;
            }else {
                c++;
                track = lp[i].t;
            }
        }
        return c;
    }
}
