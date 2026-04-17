// import java.util.*;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer>frequencyMap = new HashMap<>();
        for(int n : nums){
            frequencyMap.put(n, frequencyMap.getOrDefault(n, 0) + 1);
        }
        int [] res = new int [k];
int i=0;
while(i<k){
        int max = 0;
        int maxKey = 0;
        for(Map.Entry<Integer, Integer>entry : frequencyMap.entrySet()){
        if(entry.getValue() > max){
            max = entry.getValue();
            maxKey = entry.getKey();
        }
            
        }
        frequencyMap.remove(maxKey);
        res[i] = maxKey;
        i++;
        }
        return res;
    }
}
