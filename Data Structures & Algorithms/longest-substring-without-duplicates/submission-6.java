class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0){
                return 0;
            }
            int l = 0;
                int r = 0;
                int len = 0;
                Set<Character>set = new HashSet<>();
                while(r < s.length()){
                        if(set.contains(s.charAt(r))){
                                set.remove(s.charAt(l));
                                l++;
                        }else{
                                set.add(s.charAt(r));
                                len = Math.max(len,set.size());
                                r++;
                        }
                }
                return len;
    }
}
