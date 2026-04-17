class Solution {
    public int[] productExceptSelf(int[] nums) {
     int zeroIdx = -1;
        List<Integer> zeros = new ArrayList<>();
        int product = 1;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 0){
                zeroIdx = i;
                zeros.add(i);
                continue;
            }
            product*=nums[i];
        }
        int [] result = new int [nums.length];
        if(zeros.isEmpty()){
            for(int i=0;i<nums.length;i++){
                result[i] = product/nums[i];
            }
        }else if(!zeros.isEmpty() && zeros.size()==1){
            result[zeroIdx] = product;
        }else if(!zeros.isEmpty()){
            return new int [nums.length];
        }
        return result;
    }
}  
