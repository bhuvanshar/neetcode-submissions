class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0){
                return 0;
            }
            int l = 0;
            int r = 1;
            int maxLen = 1;
            HashSet<Character>set = new HashSet<>();
            set.add(s.charAt(l));
            while(r < s.length()){
                if(set.contains(s.charAt(r))){
                    set.remove(s.charAt(l));
                    l++;
                }else{
                    set.add(s.charAt(r));
                    maxLen = Integer.max(maxLen, r-l+1);
                    r++;

                }
            }
            return maxLen;
    }
}
