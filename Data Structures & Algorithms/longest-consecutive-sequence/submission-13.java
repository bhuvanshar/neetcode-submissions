class Solution {
    // [2,20,4,10,3,4,5]
    // [2,3,4,4,5,10,20]
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
       Set<Integer>set = new HashSet<>();
                for(int i=0;i<nums.length;i++){
                        set.add(nums[i]);
                }
                int count = 1;
                int max = 1;
                for(int i=0;i<nums.length;i++){
                        int x = 1;
                        while(set.contains(nums[i]+x)){
                                count++;
                                x++;
                        }
                        max = Math.max(count,max);
                        count = 1;
                }
                return max;
    }
}
