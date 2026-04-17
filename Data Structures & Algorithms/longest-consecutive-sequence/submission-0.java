class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int cnt = 0;
        int maxCnt = 0;
        for(Integer num : nums){
            set.add(num);
        }
        for(int i=0; i<nums.length;i++){
            int x = 0;
            while(set.contains(nums[i] + x)){
                cnt++;
                x++;
            }
            maxCnt = Integer.max(maxCnt, cnt);
            cnt = 0;
        }

        return maxCnt;
    }

}
