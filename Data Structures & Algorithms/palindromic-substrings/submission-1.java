class Solution {
    public int countSubstrings(String s) {
        int n = s.length();
        int res = 0;
        for(int i=0;i<n;i++){
            int l = i;
            int r = i;
            res+= count(s, l, r);
            res+= count(s, l, r+1);
        }
        return res;
    }
    public int count(String s, int l, int r){
        int res = 0;
        while(l >=0 && r < s.length() && s.charAt(l) == s.charAt(r)){
            l--;
            r++;
            res +=1;
        }
        return res;
    }
}
