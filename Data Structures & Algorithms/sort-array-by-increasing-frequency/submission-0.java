class Solution {
    public class Pair{
        int num;
        int freq;
        public Pair(int num, int freq){
            this.num = num;
            this.freq = freq;
        }
    }
    public int[] frequencySort(int[] nums) {
        Pair [] p = new Pair[nums.length];
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for(int i=0;i<nums.length;i++){
            p[i] = new Pair(nums[i], map.get(nums[i]));
        }

        Arrays.sort(p, (a,b)->{
            if(a.freq == b.freq){
                return Integer.compare(b.num,a.num);
            }
            return Integer.compare(a.freq,b.freq);
        });
        int [] res = new int [nums.length];
        int i = 0;
        for(Pair v : p){
            res[i] = v.num;
            i++;
        }
        return res;
    }
}