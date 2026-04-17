class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0)return 0;
        Set<Integer>set = new HashSet<>();
        
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int l = 0;
        int max = 1;
        for(Integer num : nums){
            if(!set.contains(num-1)){
                l = 1;
                while(set.contains(num+1)){
                    l++;
                    num++;
                    max = Math.max(max, l);
                }
            }
        }
    return max;
    }
}
