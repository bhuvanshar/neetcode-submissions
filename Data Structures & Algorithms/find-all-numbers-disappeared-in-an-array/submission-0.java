class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> res = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for(int n : nums){
            map.put(n, map.getOrDefault(n, 0)+1);
        }
        for(int i=1;i<=nums.length;i++){
            if(!map.containsKey(i)){
                res.add(i);
            }
        }
        return res;
    }
}