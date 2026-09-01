class Solution {
    public boolean isOneEditDistance(String s, String t) {
        char [] sc = s.toCharArray();
        char [] tc = t.toCharArray();
        if(sc.length == tc.length){
            int l = 0;
            int r = 0;
            int c = 0;
            while(l < sc.length){
                if(sc[l] == tc[r]){
                    l++;
                    r++;
                }else{
                    sc[l] = tc[r];
                    String ss = new String(sc);
                    String tt = new String(tc);
                    return ss.equals(tt);
                }
            }
        }else if(tc.length - sc.length == 1){
            int l = 0;
            int r = 0;
            int c = 0;
            while(l < sc.length){
                if(sc[l] == tc[r]){
                    l++;
                    r++;
                    continue;
                }else{
                    r++;
                    c++;
                    if(c > 1)return false;
                }
            }
            return true;
        }else if(tc.length - sc.length == -1){
            int l = 0;
            int r = 0;
            int c = 0;
            while(r < tc.length){
                if(sc[l] == tc[r]){
                    l++;
                    r++;
                    continue;
                }else{
                    l++;
                    c++;
                    if(c > 1)return false;
                }
            }
            return true;
        }
        return false;
    }
}
