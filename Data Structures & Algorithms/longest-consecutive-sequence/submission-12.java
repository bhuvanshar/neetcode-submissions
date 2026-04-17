class Solution {
    // [2,20,4,10,3,4,5]
    // [2,3,4,4,5,10,20]
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
       Arrays.sort(nums);
//                [2,3,4,4,5,10,20]
                int l = 0;
                int r = 1;
                int maxLen = 1;
                int i=1;
                while(r < nums.length){
                        if(nums[r]-nums[l] ==i){
                                r++;
                                i++;
                                maxLen = Math.max(i, maxLen);
                        }else if(nums[r] == nums[r-1]){
                                r++;
                                continue;
                        }else{
                                l = r;
                                r++;
                                i = 1;
                        }
                }
                return maxLen;
    }
}
