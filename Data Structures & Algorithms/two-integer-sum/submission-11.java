class Solution {
    public int getKey(HashMap<Integer,Integer>map, int value){
        for(Map.Entry<Integer,Integer>entry : map.entrySet()){
            if(entry.getValue() == value){
                return entry.getKey();
            }
        }
        return -1;
    }
    public int[] twoSum(int[] nums, int target) {
        //a+b=c
        //a = c-b
        HashMap<Integer, Integer>map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(i, nums[i]);
        }
        int [] result = new int[2];
        for(int i=0;i<nums.length;i++) {
            int search = target - nums[i];
            map.remove(i);
            if(map.containsValue(search)){
                int idx1 = getKey(map,search);
                int idx2 = i;
                if(idx1 > idx2){
                    result[0] = idx2;
                    result[1] = idx1;
                    return result;
                }else{
                    result[0] = idx1;
                    result[1] = idx2;
                    return result;
                }
                // break;
            }
            map.put(i, nums[i]);
        }
        return new int [2];
    }
}
