class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer>set = new HashSet<>();
            for(int i=0;i<nums.length;i++){
                set.add(nums[i]);
            }
            int cnt = 0;
            for(int x : set){
                if(!set.contains(x-1)){
                    int length = 1;
                    while(set.contains(x+length)){
                        length++;
//                        x++;
                    }
                    cnt = Integer.max(cnt, length);
                }

            }
            return cnt;
    }
}
