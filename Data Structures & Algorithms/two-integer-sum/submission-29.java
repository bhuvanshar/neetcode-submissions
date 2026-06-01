class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int i = 0;
        int [] res = new int [2];
        for(int n : nums){
            int t = target-n;
            if(map.containsKey(t)){
                res[0] = map.get(t);
                res[1] = i;
                return res;
            }
            map.put(n, i);
            i++;
        }
        return res;
    }
}
