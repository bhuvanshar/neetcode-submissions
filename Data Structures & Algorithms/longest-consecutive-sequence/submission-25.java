class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer>set = new HashSet<>();
        for(int i : nums){
            set.add(i);
        }
        int l = 0;
        int max = 0;
        int x = 0;
        for(int i=0;i<nums.length;i++){
            l = 0;
            while(set.contains(nums[i]-l)){
                l++;
            }
            x = 0;
            while(set.contains(nums[i] + x)){
                x++;
            }
            max = Math.max(x, max);
        }
        return max;
    }
}
