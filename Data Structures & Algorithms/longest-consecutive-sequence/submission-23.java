class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i : nums){
            set.add(i);
        }
        int maxLen = 0;
        for(int i=0;i<nums.length;i++){
            if(!set.contains(nums[i]-1)){
                int l = 0;
                while(set.contains(nums[i] + l))l++;
                maxLen = Math.max(maxLen, l);
            }
        }
        return maxLen;
    }
}
