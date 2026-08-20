class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int val : nums){
            map.put(val, map.getOrDefault(val, 0) + 1);
        }
        int reqFreq = nums.length/3;
        List<Integer> ls = new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() > reqFreq){
                ls.add(entry.getKey());
            }
        }
        return ls;
    }
}