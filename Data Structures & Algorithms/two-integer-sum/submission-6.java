class Solution {
    public int[] twoSum(int[] nums, int target) {
        int firstIndex = 0;
        int secondIndex = 0;
        for(int i=0;i<nums.length;i++){
            for(int j = 0;j<nums.length;j++){
                if(nums[j] == target - nums[i] && j != i){
                    if(j < i){
                        firstIndex = j;
                        secondIndex = i;
                    }else{
                        firstIndex = i;
                        secondIndex = j;
                    }
                }
            }
            
        }
        int [] result = new int [2];
            result[0] = firstIndex;
            result[1] = secondIndex;
            return result;
    }
}
