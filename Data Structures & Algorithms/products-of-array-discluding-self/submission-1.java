class Solution {
    public int[] productExceptSelf(int[] nums) {
        int index = -1;
            for(int i = 0;i<nums.length;i++){
                if(nums[i] == 0){
                    index = i;
                }
            }
            if(index != -1){
                int [] result = new int [nums.length];
                int product = 1;
                for(int i=0;i<nums.length;i++){
                    if(i != index){
                        product*=nums[i];
                    }
                    result[i] = 0;
                }
                
                result[index] = product;
                return result;
            }else{
                int product = 1;
                for(int x : nums){
                    product *= x;
                }
                int [] result = new int [nums.length];
                
                for(int i=0;i<nums.length;i++){
                    result[i] = product/nums[i];
                }
                return result;
            }
    }
}  
