class Solution {
    public void reverse(char[] c, int s, int e){
        while(s <= e){
            char temp = c[s];
            c[s] = c[e];
            c[e] = temp;
            s++;
            e--;
        }
    }
    public void reverseWords(char[] s) {
        reverse(s, 0, s.length-1);
        int l = 0;
        for(int i=0;i<s.length;i++){
            if(s[i] == ' '){
                reverse(s, l, i-1);
                l = i+1;
            }
        }
        reverse(s, l, s.length-1);
    }
}
