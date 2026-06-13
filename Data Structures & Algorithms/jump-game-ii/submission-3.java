class Solution {
    public int jump(int[] nums) {
        if(nums.length == 0)return 0;
        // return solve(nums, 0);
        int [] memo = new int [nums.length];
        Arrays.fill(memo, -1);
        return memo(nums, 0, memo);
    }
    public int solve(int [] nums, int index){
        if(index >= nums.length-1)return 0;

        int min = Integer.MAX_VALUE;

        for(int jump = 1; jump <= nums[index]; jump++){
            int next = solve(nums, index + jump);
            if(next!= Integer.MAX_VALUE){
                min = Math.min(min, next+1);
            }
        }
        return min;
    }

    public int memo(int [] nums, int index, int [] memo){
        if(index >= nums.length-1)return 0;
        if(memo[index] != -1)return memo[index];
        int min = Integer.MAX_VALUE;

        for(int jump = 1; jump <= nums[index]; jump++){
            int next = memo(nums, index + jump, memo);
            if(next!= Integer.MAX_VALUE){
                min = Math.min(min, next+1);
            }
        }
        return memo[index] = min;
    }
}
