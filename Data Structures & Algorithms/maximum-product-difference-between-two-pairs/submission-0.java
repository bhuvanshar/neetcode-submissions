class Solution {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        int x = nums[0];
        int y = nums[1];
        int a = nums[nums.length-1];
        int b = nums[nums.length-2];
        return a*b - x*y;
    }
}