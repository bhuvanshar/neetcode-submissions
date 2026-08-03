class Solution {
    public class Pair{
        int num;
        int dif;
        int index;
        public Pair(int num, int dif, int index){
            this.num = num;
            this.dif = dif;
            this.index = index;
        }
    }
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        Queue<Pair> pq = new PriorityQueue<>((a,b)->{
            if(Math.abs(a.num - x) < Math.abs(b.num - x)){
                return -1;
            }else if(Math.abs(a.num - x) == Math.abs(b.num-x)){
                if(a.num < b.num){
                    return -1;
                }else if(b.num < a.num) return 1;
                else return 0;
            }else return 1;
        });
        for(int i=0;i<arr.length;i++){
            Pair p = new Pair(arr[i], Math.abs(x-arr[i]), i);
            pq.offer(p);
        }
        List<Integer> res = new ArrayList<>();
        int i=0;
        while(i<k){
            res.add(pq.poll().num);
            i++;
        }
        Collections.sort(res);
        return res;
    }
}