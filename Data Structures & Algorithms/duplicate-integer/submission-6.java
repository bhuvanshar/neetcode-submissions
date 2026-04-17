class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
            if(map.get(num) > 1){
                return true;
            }
        }
    //    for(Map.Entry<Integer,Integer> entry : map.entrySet()){
    //        if(entry.getValue() > 1){
    //            return false;
    //        }
    //    }

        return false;
    }
}