class Solution {
    public int productArr(int [] nums, int exclude){
        int [] res = new int [nums.length];
        int product = 1;
        for(int i=0;i<nums.length;i++){
            if(i!=exclude){
            product*=nums[i];
            }
        }
        return product;
    }
    public int[] productExceptSelf(int[] nums) {
        boolean arrContainsZero = false;
        int [] result = new int [nums.length];
        int zeroIdx = -1;
        int zeroCnt = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 0){
                arrContainsZero = true;
                zeroIdx = i;
                zeroCnt++;
            }
        }
        if(zeroCnt > 1){
            return result;
        }
        if(zeroIdx != -1){
            result[zeroIdx] = productArr(nums, zeroIdx);
            return result;
        }else{
            int pro = productArr(nums,-1);
            for(int i=0;i<nums.length;i++){
                result[i] = pro/nums[i];
            }
            return result;
        }
        
        // return result;

    }
}  
