class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int s = n * (n+1)/2;
        int s2 = 0;
        for(int j : nums){
            s2+=j;
        }
        return s-s2;
    }
}
