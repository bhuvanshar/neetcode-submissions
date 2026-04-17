class Solution {
    public int[] topKFrequent(int[] nums, int k) {
         Map<Integer, Integer>map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i], map.getOrDefault(nums[i],0) + 1);
        }
        int maxFreq = Integer.MIN_VALUE;
        for(Map.Entry<Integer,Integer>entry : map.entrySet()){
            maxFreq = Math.max(entry.getValue(), maxFreq);
        }
        List<List<Integer>>freqBucket = new ArrayList<>(maxFreq+1);

        for (int i = 0; i <= maxFreq; i++) {
            freqBucket.add(new ArrayList<>());
        }

        for(Map.Entry<Integer,Integer>entry : map.entrySet()){
            int num = entry.getKey();
            int freq = entry.getValue();
            freqBucket.get(freq).add(num);
        }
        int [] res = new int [k];
        int x = 0;
        int t = freqBucket.size()-1;
        while(true){
            if(!freqBucket.get(t).isEmpty()){
                List<Integer> temp = freqBucket.get(t);
                for(int i=temp.size()-1;i>=0;i--){
                    res[x] = temp.get(i);
                    x++;
                    if(x == k)
                        break;
                }

            }
            if(x == k){
                break;
            }
            t--;
        }
    return res;
    }
}
