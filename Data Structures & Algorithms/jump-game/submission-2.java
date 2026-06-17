class Solution {
    public boolean canJump(int[] nums) {
        int last = nums.length-1;
        int n = nums.length;
        for(int i=n-2; i>=0;i--){
            if(nums[i] + i >= last){
                last = i;
            }
        }

        return last == 0;
    }
}
