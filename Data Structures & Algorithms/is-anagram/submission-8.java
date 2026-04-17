class Solution {
    public boolean isAnagram(String s, String t) {
if(t.length() != s.length()){
                        return false;
                }
                
                int match = 0;
                int [] sArr = new int[26];
                int [] tArr = new int[26];
                
                for(int i=0;i<s.length();i++){
                        sArr[(int)s.charAt(i)-(int)('a')]++;
                        tArr[(int)t.charAt(i)-(int)('a')]++;
                }
                
                for(int i=0;i<26;i++){
                        if(sArr[i] == tArr[i]){
                                match++;
                        }
                }
                if(match == 26){
                        return true;
                }else{
                        return false;
                }
    }
}
