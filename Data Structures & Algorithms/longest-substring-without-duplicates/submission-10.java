class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0)return 0;
        Set<Character>set = new HashSet<>();
        int l = 0;
        int r = 0;
        int maxLen = 0;
        while(r < s.length()){
            if(set.contains(s.charAt(r))){
                set.remove(s.charAt(l));
                l++;
            }else{
                set.add(s.charAt(r));
                r++;
                maxLen = Math.max(maxLen, r-l+1);
            }
        }
        return maxLen-1;
    }
}
