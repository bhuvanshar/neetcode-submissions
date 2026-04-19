class Solution {
    public int longestConsecutive(int[] nums) {
        int max = 0;
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i]-1)){
                // i++;
            }else{
                int r = nums[i];
                int len = 0;
                while(set.contains(r)){
                    len++;
                    r++;
                }
            max = Math.max(max, len);
            }
        }
        return max;
    }
}
