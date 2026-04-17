class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0)return "";
        String s = strs[0];

        for(int i=1; i<strs.length;i++){
            int j = 0;
            while(j<Math.min(s.length(), strs[i].length())){
                if(s.charAt(j) != strs[i].charAt(j)){
                    break;
                }
                j++;
            }
            s = s.substring(0,j);
        }
        return s;
    }
}