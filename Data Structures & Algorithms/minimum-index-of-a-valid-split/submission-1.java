class Solution {
    public int voting(List<Integer> nums){
        int candidiate = 0;
        int count = 0;
        for(int val : nums){
            if(count == 0){
                count = 1;
                candidiate = val;
            }else{
                if(candidiate == val){
                    count++;
                }else{
                    count--;
                }
            }
        }
        count = 0;
        for(int val : nums){
            if(val == candidiate){
                count++;
            }
        }
        if(count > nums.size()/2){
            return candidiate;
        }else{
            return -1;
        }
    }
    public int minimumIndex(List<Integer> nums) {
        int overallMaj = voting(nums);
        int left = 0;
        int right = 0;
        for(int val : nums){
            if(val == overallMaj){
                right++;
            }
        }
        for(int i=0;i<nums.size();i++){
            if(nums.get(i) == overallMaj){
                left++;
                right--;
            }

            if(2*left > i+1 && 2*right > (nums.size() - i - 1)){
                return i;
            }
        }
        return -1;
    }
}