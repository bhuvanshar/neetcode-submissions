class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer>map = new HashMap<>();
        int c = 0;
        for(int i : nums){
            map.put(i, c);
            c++;
        }
        int [] res = new int [2];
        for(int i=0;i<nums.length;i++){
            int tar = target-nums[i];
            if(map.containsKey(tar) && map.get(tar) != i){
                res[0] = map.get(tar) < i ? map.get(tar):i;
                res[1] = map.get(tar) > i ? map.get(tar):i;
                return res;
            }
        }
        return res;
    }
}
