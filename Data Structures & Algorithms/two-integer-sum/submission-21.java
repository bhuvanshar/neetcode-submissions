class Solution {
    public int[] twoSum(int[] nums, int target) {
        int [] res = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i], i);
        }
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])){
                if(i != map.get(target-nums[i])){
                res[0] = i < map.get(target-nums[i])? i:map.get(target-nums[i]);
                res[1] = i > map.get(target-nums[i])? i:map.get(target-nums[i]);
                }
            }
        }
        return res;
    }
}
