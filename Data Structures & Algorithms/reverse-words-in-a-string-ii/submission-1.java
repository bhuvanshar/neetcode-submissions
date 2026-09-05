class Solution {
    public void reverse(int st, int en, char[] ch){
        char temp = 'a';
        while(st <= en){
            temp = ch[st];
            ch[st] = ch[en];
            ch[en] = temp;
            st++;
            en--;
        }
    }
    public void reverseWords(char[] s) {
        reverse(0, s.length-1, s);

        int l = 0;
        for(int i=0;i<s.length;i++){
            if(s[i] == ' '){
                reverse(l, i-1,s);
                l = i+1;
            }
        }
        reverse(l, s.length-1,s);
    }
}
