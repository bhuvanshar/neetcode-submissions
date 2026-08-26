class Solution {
    public int appendCharacters(String s, String t) {
        int ti = 0;
        int si = 0;
        while(ti < t.length() && si < s.length()){
            if(s.charAt(si) == t.charAt(ti)){
                ti++;
                si++;
            }else{
                si++;
            }
        }

        return t.length()-ti;
    }
}