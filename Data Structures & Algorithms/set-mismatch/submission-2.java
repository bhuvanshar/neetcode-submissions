class Solution {
    public int[] findErrorNums(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        boolean br = false;
        for(int i=0;i<nums.length;i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        int x = 0;
        int y = 0;
        for(int i=1;i<=nums.length; i++){
            if(map.containsKey(i)){
                if(map.get(i) == 2){
                    x = i;
                    br = true;
                }
            }else{
                y = i;
                if(br)break;
            }
        }
        return new int []{x,y};
    }
}