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
        // int [] arr = new int [s.length()];
        // for(int i=0;i<s.length();i++){
        //     arr[i] = i+shiftN;
        //     if(arr[i] < 0){
        //         arr[i] += s.length();
        //     }else if(arr[i] > s.length()){
        //         arr[i]-=s.length();
        //     }
        // }
    char [] ans = new char[s.length()];
    for(int i=0;i<ans.length;i++){
        ans[(i + shiftN) % s.length()] = s.charAt(i);
    }
    String an = new String(ans);
    return an;
    }
}
