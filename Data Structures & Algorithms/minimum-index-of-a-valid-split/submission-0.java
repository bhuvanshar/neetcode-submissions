class Solution {
    public int voting(List<Integer> nums){
        int cand = 0;
        int count = 0;
        for(int val : nums){
            if(count == 0){
                cand = val;
                count = 1;
            }else{
                if(cand == val){
                    count++;
                }else{
                    count--;
                }
            }
        }
        count = 0;
        for(int val : nums){
            if(cand == val){
                count++;
            }
        }
        if(count > nums.size()/2)return cand;
        else{
            return -1;
        }
    }
    public int minimumIndex(List<Integer> nums) {
        int overallDom = voting(nums);
        int left = 0;
        int right = 0;
        int x = 0;
        while(x < nums.size()-1){
            for(int i=0;i<nums.size();i++){
                if(i > x && nums.get(i) == overallDom){
                    right++;
                }else if(i <= x && nums.get(i) == overallDom){
                    left++;
                }
            }
            if(2*right > nums.size()-x-1 && 2*left > x+1){
                return x;
            }
            x++;
            right = 0;
            left = 0;
        }
        return -1;
    }
}