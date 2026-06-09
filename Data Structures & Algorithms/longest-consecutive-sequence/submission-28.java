class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i : nums){
            set.add(i);
        }
        int max = 0;
        for(int n : nums){
        int l = 1;
            if(set.contains(n-1)){
                continue;
            }else{
                while(set.contains(n+1)){
                    l++;
                    n++;
                }
            }
        max = Math.max(max, l);
        }
        return max;
    }
}
