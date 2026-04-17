class Solution {
    public int[] twoSum(int[] nums, int target) {
        List<Integer>list = new ArrayList<>();
        int [] res = new int [2];
        Map<Integer, List<Integer>> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.get(nums[i]).add(i);
            }else{
                List<Integer> l = new ArrayList<>();
                l.add(i);
                map.put(nums[i], l);
            }
        }
        for(int i=0;i<nums.length;i++){
            int find = target-nums[i];

            if(map.containsKey(find)){
                List<Integer> indexes = map.get(find);
                for(Integer index : indexes){
                    if(index != i){
                        res[0] = index < i ? index : i;
                        res[1] = index > i ? index : i;
                        return res;
                    }
                }
            }
        }
        return res;
    }
}
