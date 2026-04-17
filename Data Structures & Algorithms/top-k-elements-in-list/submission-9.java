class Solution {
    public class Pair{
                int frequency;
                int number;
                public Pair(int frequency, int number){
                        this.frequency = frequency;
                        this.number = number;
                }
        }
    public int[] topKFrequent(int[] nums, int k) {
                Map<Integer, Pair>map = new HashMap<>();
                for(int i=0;i<nums.length;i++){
                        if(map.containsKey(nums[i])){
                                Pair x = map.get(nums[i]);
                                x.frequency++;
                                map.put(nums[i], x);
                        }else{
                                map.put(nums[i], new Pair(1,nums[i]));
                        }
                }
//                System.out.println(map);
                Pair [] sortingArr = new Pair[map.size()];
                int i = 0;
                for(Map.Entry<Integer, Pair>entry : map.entrySet()){
                        sortingArr[i] = entry.getValue();
                        i++;
                }
                Arrays.sort(sortingArr, (a,b)->{
                        if(a.frequency < b.frequency)return 1;
                        else if (a.frequency == b.frequency)return 0;
                        else return -1;
                });
                int [] res = new int [k];
                for(int c=0;c<k;c++){
                        res[c] = sortingArr[c].number;
                }
                return res;
       }
}
