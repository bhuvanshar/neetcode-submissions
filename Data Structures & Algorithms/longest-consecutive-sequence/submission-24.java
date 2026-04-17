class Solution {
    public int longestConsecutive(int[] nums) {
        
        Set<Integer> set = new HashSet<>();
        int max = 0;
        for(int i : nums){
            set.add(i);
        }
        for(int i : nums){
            if(!set.contains(i)){
                continue;
            }
            int l = 0;
            int n = i;
            while(set.contains(n-1)){
                n--;
            }
            while(set.contains(n)){
                l++;
                set.remove(n);
                n++;
            }
            max = Math.max(max, l);
        }
        return max;
    }
}
