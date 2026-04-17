public class Solution {
    public int[] twoSum(int[] nums, int target) {
       HashMap<Integer, Integer>map = new HashMap<>();
        int [] res = new int [2];
        for(int i=0;i<nums.length;i++){
            int num = nums[i];
            int search = target - num;
            if(map.containsKey(search) && map.get(search) != i){
                res[0] = i > map.get(search) ? map.get(search) : i;
                res[1] = i < map.get(search) ? map.get(search) : i;
                return res;
            }else{
                map.put(nums[i],i);
            }
        }
        return new int [0];
    }
}