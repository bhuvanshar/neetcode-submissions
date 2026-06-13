class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        if(n == 0)return false;
        Boolean [] memo = new Boolean [n];
        return memo(nums, 0, memo);
    }
    public boolean solve(int [] nums, int index){
        if(index >= nums.length-1)return true;

        for(int jump = 1; jump<= nums[index]; jump++){
            if(solve(nums, index + jump)){
                return true;
            }
        }
        return false;
    }

    public boolean memo(int [] nums, int index, Boolean [] memo){
        if(index >= nums.length-1)return true;
        if(memo[index] != null)return memo[index];
        for(int jump = 1; jump <= nums[index]; jump ++){
            if(memo(nums, index + jump, memo)){
                return memo[index] = true;
            }
        }
        return memo[index] = false;
    }
}
