class Solution {
    // [2,20,4,10,3,4,5]
    // [2,3,4,4,5,10,20]
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
       Set<Integer>set = new HashSet<>();
        for(int n : nums){
            set.add(n);
        }
        int max = 0;
        int t = 0;
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i]-1)){
                t = 0;
                continue;
            }else{
                int num = nums[i];
                while(set.contains(nums[i] + t)){
                    max = Math.max(max,t);
                    t++;
                }
                t = 0;
            }
        }
        return max+1;
    }
}
