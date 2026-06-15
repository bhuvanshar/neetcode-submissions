class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int n : nums){
            sum+=n;
        }
        if(sum % 2 != 0)return false;
        int target = sum/2;
        Boolean [][] memo = new Boolean[nums.length + 1][target + 1];
        return memo(nums, 0, target, memo);
    }

    public boolean solve(int [] nums, int i, int target){
        if(i == nums.length){
            return target == 0;
        }
        if(target < 0){
            return false;
        }

        boolean take = solve(nums, i+1, target - nums[i]);
        boolean notTake = solve(nums, i+1, target);
        return take || notTake;
    }
    public boolean memo(int [] nums, int i, int target, Boolean [][] memo){
        if(i == nums.length){
            return target == 0;
        }
        if(target < 0)return false;

        if(memo[i][target] != null)return memo[i][target];

        boolean take = memo(nums, i+1, target-nums[i], memo);
        boolean notTake = memo(nums, i+1, target, memo);

        return memo[i][target] = take || notTake;
    }
}
