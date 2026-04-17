class Solution {
    public int longestConsecutive(int[] nums) {
        int longest = 0;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        for (int i = 0; i < nums.length; i++) {
            int number = nums[i];

            if (!set.contains(number - 1)) {
                int count = 0;
                while (set.contains(number + count)) {
                    count++;
                }
                longest = Math.max(longest, count);
            }
        }
        return longest;
    }
}
