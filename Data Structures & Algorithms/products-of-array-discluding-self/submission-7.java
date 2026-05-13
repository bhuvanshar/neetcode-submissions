class Solution {
    public int[] productExceptSelf(int[] nums) {
        int zeroIndex = -1;
        int zerocnt = 0;
        int p = 1;
        int [] res = new int [nums.length];
        for(int i =0;i<nums.length;i++){
            if(nums[i] == 0){
                zeroIndex = i;
                zerocnt++;
            }
            if(nums[i]!=0)
                p *= nums[i];
        }
        if(zeroIndex == -1){
            for(int i=0;i<nums.length;i++){
                res[i] = p/nums[i];
            }
            return res;
        }else if(zeroIndex != -1 && zerocnt == 1){
            res[zeroIndex] = p;
            return res;
        }else{
            return res;
        }
    }
}  
