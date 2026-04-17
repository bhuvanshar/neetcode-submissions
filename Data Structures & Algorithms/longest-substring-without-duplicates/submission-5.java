class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s == null){
            return 0;
        }
        if(s.isEmpty()){
            return 0;
        }
        int l = 0;
        int r = l+1;
        int maxCount = 1;
        Set<Character>set = new HashSet<>();
        set.add(s.charAt(l));
        int count = 1;
        while(r < s.length()){
            if(!set.contains(s.charAt(r))){
                set.add(s.charAt(r));
                r++;
                count++;
                maxCount = Math.max(maxCount, count);
            }else{
                set.remove(s.charAt(l));
                l++;
                count--;
            }
        }
        return maxCount;
    }
}
