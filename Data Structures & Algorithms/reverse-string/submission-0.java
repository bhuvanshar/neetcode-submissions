class Solution {
    public void swap(int l, int r, char[]s){
        char temp = s[l];
        s[l] = s[r];
        s[r] = temp;
    }
    public void reverseString(char[] s) {
        int l = 0;
        int r = s.length-1;
        while(l <=r){
            swap(l,r,s);
            l++;
            r--;
        }
    }
}