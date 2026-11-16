class Solution {
    public long maximumSumScore(int[] nums) {
        long max = Integer.MIN_VALUE;
        int n = nums.length;
        long [] forwardPrefix = new long [n];
        forwardPrefix[0] = nums[0];
        long [] reversePrefix = new long [n];
        reversePrefix[0] = nums[nums.length-1];
        for(int i=1;i<nums.length;i++){
            forwardPrefix[i] = forwardPrefix[i-1] + nums[i];
        }
        long[] reversed = new long[nums.length];

        for (int i = 0; i < nums.length; i++) {
            reversed[i] = nums[nums.length - 1 - i];
        }
        // Arrays.reverse(nums);
        for(int i=1;i<nums.length;i++){
            reversePrefix[i] = reversePrefix[i-1] + reversed[i];
        }
        for(int i=0;i<n;i++){
            max = Math.max(max, Math.max(reversePrefix[i], forwardPrefix[i]));
        }
        return max;
    }
}
