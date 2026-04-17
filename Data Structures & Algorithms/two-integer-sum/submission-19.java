class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, ArrayList<Integer>> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                ArrayList<Integer> arr = map.get(nums[i]);
                arr.add(i);
                map.put(nums[i], arr);
            }else{
                map.put(nums[i], new ArrayList<>(Arrays.asList(i)));
            }
        }
        int [] res = new int [2];
        for(int i=0;i<nums.length;i++){
            int nu = target - nums[i];

            if(map.containsKey(nu)){
                int idx1 = map.get(nu).get(0);
                int idx2 = i;
            if(idx1 != idx2){
                if(idx1 < idx2){
                    res[0] = idx1;
                    res[1] = idx2;
                    return res;
                }else{
                    res[0] = idx2;
                    res[1] = idx1;
                    return res;
                }
            }
            }
        }
        return res;
    }
}
