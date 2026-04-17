class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0)return 0;
        int l = 0;
        int r = l+1;
        int maxLen = 1;
        Set<Character> set = new HashSet<>();
        set.add(s.charAt(l));
        while(r < s.length()){
            if(!set.contains(s.charAt(r))){
                set.add(s.charAt(r));
                maxLen = Math.max(maxLen, set.size());
                r++;
            }else{
                while(set.contains(s.charAt(r))){
                    set.remove(s.charAt(l));
                    l++;
                }
            }
            
        }
        maxLen = Math.max(maxLen, set.size());
        return maxLen;
    }
}
