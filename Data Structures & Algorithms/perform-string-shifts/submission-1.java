class Solution {
    public String stringShift(String s, int[][] shift) {
        int shiftN = 0;
        for(int [] sh : shift){
            int d = sh[0];
            int amt = sh[1];
            if(d == 0){
                shiftN -=amt;
            }else{
                shiftN+=amt;
            }
        }
        shiftN = shiftN%s.length();
        if(shiftN < 0)shiftN = shiftN + s.length();
    char [] ans = new char[s.length()];
    for(int i=0;i<ans.length;i++){
        ans[(i + shiftN) % s.length()] = s.charAt(i);
    }
    String an = new String(ans);
    return an;
    }
}
