class Solution {
    public boolean canPlaceFlowers(int[] nums, int x) {
        int c = 0;
        int sum = 0;

        int n = nums.length;
        if(n == 1 && nums[0] == 0 && x <= 1)return true;
        else if(n == 0 && x == 0)return true;
        else if(n == 0 && x == 1)return false;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 0){
                if(i == 0){
                    if(nums[i+1] != 1){
                        c++;
                        nums[i] = 1;
                    }
                }else if(i == n-1){
                    if(nums[i-1] != 1){
c++;
                        nums[i] = 1;
                        return c >= x;
                    }else{
                        return c >= x;
                    }
                }
                if(i > 0 && nums[i-1] != 1 && nums[i+1] != 1){
                    c++;
                    nums[i] = 1;
                }
            }
        }
        return c >= x;
    }
}