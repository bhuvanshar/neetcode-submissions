class Solution {
    public boolean isConsecutive(int[] nums) {
        int n = nums.length;
        Set<Integer> set = new HashSet<>();
        int start = Integer.MAX_VALUE;
        int count;
        for(int v : nums){
            start = Math.min(start, v);
            set.add(v);
        }
        if(set.size() != n)return false;

        start--;
        for(int b : set){
            if(set.contains(start+1)){
                start++;
            }else{
                return false;
            }
        }
        return true;
    }
}
