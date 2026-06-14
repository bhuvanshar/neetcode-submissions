class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> window = new HashSet<>();
        int l = 0;
        int max = 0;
        for(int i=0;i<s.length();i++){
            if(!window.contains(s.charAt(i))){
                window.add(s.charAt(i));
                max = Math.max(max, window.size());
            }else{
                window.remove(s.charAt(l));
                l++;
                i--;
            }
        }
        return max;
    
    }
}
