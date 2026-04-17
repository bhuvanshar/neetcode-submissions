class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())return false;
        int [] arr = new int [26];

        for(int i=0;i<s.length();i++){
            arr[(int)(s.charAt(i) - (int)('a'))]++;
            arr[(int)(t.charAt(i) - (int)('a'))]--;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i] != 0){
                return false;
            }
        }
        return true;
    }
}
