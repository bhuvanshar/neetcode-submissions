class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer>frequencyMap = new HashMap<>();
            for(int n : nums){
                frequencyMap.put(n, frequencyMap.getOrDefault(n, 0) + 1);
            }
            
            int [] result = new int [k];
            int maxNum = 0;
            for(int i=0;i<k;i++) {
                int max=Integer.MIN_VALUE;
                for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
                    if (entry.getValue() > max) {
                        max = entry.getValue();
                        maxNum = entry.getKey();
                    }
                }
                result[i] = maxNum;
                frequencyMap.remove(maxNum);
            }
            return result;
    }
}
