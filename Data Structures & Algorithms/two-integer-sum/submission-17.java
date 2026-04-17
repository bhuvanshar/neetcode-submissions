class Solution {
    public int[] twoSum(int[] nums, int target) {
int [] result = new int [2];
                Map<Integer, Integer>map = new HashMap<>();
                for(int i=0;i<nums.length;i++){
                        int complement = target-nums[i];
                        int number = nums[i];
                        if(map.containsKey(complement) && map.get(complement) != i){
                                result[0] = i<=map.get(complement)?i:map.get(complement);
                                result[1] = i<map.get(complement)?map.get(complement):i;
                                return result;
                        }else{
                                map.put(number, i);
                        }
                }
                return new int[2];
    }
}
