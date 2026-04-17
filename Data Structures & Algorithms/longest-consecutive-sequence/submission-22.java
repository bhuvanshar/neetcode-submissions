class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int n : nums){
            set.add(n);
        }

        int t = 0;
        int max = 0;
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i]-1)){
                continue;
            }else{
                int x = nums[i];
                while(set.contains(x)){
                    x++;
                    t++;
                }
                max = Math.max(max, t);
                t = 0;
            }
        }
        return max;
    }
}
