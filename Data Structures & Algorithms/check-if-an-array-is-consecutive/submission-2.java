class Solution {
    public boolean isConsecutive(int[] nums) {
        int low = nums[0];
        int high = nums[0];
        Set<Integer> set = new HashSet<>();
        for(int i : nums){
            if(!set.contains(i)){
                set.add(i);
            }else return false;

            low = Math.min(low, i);
            high = Math.max(high, i);
        }
        return high-low+1 == nums.length;
    }
}
