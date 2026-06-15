class Solution {
    public int countSubstrings(String s) {
        int res = 0;
        for(int i=0;i<s.length();i++){
            int l = i;
            int r = i;
            res+= countPali(s,l,r);
            res+= countPali(s,l,r+1);
        }
        return res;
    }

    public int countPali(String s, int l, int r){
        int res = 0;
        while(l>=0 && r < s.length() && s.charAt(l) == s.charAt(r)){
            l--;
            r++;
            res+=1;
        }
        return res;
    }
}
