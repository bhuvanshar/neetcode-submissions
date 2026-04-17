class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer>map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        
        int maxNum = Integer.MIN_VALUE;
        int maxNumKey = -1;
        int [] res = new int [k];
        for(int i=0;i<k;i++){
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() > maxNum){
                maxNum = entry.getValue();
                maxNumKey = entry.getKey();
                }
            }
            res[i] = maxNumKey;
            map.remove(maxNumKey);
            maxNum = Integer.MIN_VALUE;
            maxNumKey = -1;
        }
        return res;
    }
}
