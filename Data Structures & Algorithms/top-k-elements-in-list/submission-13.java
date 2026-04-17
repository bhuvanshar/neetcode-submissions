class Solution {

    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer>map = new HashMap<>();
        for(int n : nums){
            map.put(n, map.getOrDefault(n,0)+1);
        }
        List<Integer>[] bucket= new List[nums.length+1];
        for(int i=0;i<bucket.length;i++){
            bucket[i] = new ArrayList<>();
        }
        for(Map.Entry<Integer,Integer>e : map.entrySet()){
            bucket[e.getValue()].add(e.getKey());
        }
        int i=bucket.length-1;
        int [] res = new int[k];
        int itr = 0;
        while(i >= 0){
            if(!bucket[i].isEmpty()){
                List<Integer>ls = bucket[i];
                for(int j=0;j<ls.size();j++){
                    res[itr] = ls.get(j);
                    itr++;
                    if(itr == k){
                        return res;
                    }
                }
            }
            i--;
        }
        return res;
    }

}
