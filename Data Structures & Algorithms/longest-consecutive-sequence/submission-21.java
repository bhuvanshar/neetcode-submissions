class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0)return 0;
        Set<Integer> set = new HashSet<>();
        for(int i : nums){
            set.add(i);
        }
        int max = 1;
        for(int i=0;i<nums.length;i++){
            int l = 1;
            while(set.contains(nums[i] - l)){
                l++;
                max = Math.max(max, l);
            }
        }
        return max;
    }
}
