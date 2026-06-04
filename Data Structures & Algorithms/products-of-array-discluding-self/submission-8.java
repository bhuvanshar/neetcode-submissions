class Solution {
    public int[] productExceptSelf(int[] nums) {
        int [] preset = new int [nums.length];
        int [] ans = new int [nums.length];
        preset[0] = 1;
        for(int i=1;i<nums.length;i++){
            preset[i] = preset[i-1]*nums[i-1];
        }
        int right = 1;
        for(int i=nums.length-1;i>=0;i--){
            ans[i] = preset[i] * right;
            right *= nums[i];
        }
        return ans;
    }
}  
