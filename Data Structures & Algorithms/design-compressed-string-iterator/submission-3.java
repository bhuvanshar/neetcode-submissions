class StringIterator {
    String str;
    public StringIterator(String compressedString) {
        this.str = compressedString;
    }
    
    public char next() {
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            int place = 0;
            int number = 0;
            if(str.charAt(i) != '0'){
                for(int j = i+1; j<str.length();j++){
                if((int)(str.charAt(j) - '0') <= 9 && (int)(str.charAt(j) - '0') >= 0){
                    number = number * 10 + str.charAt(j) - '0';
                    place++;
                }else{
                    break;
                    }
                }
            }else continue;
            number--;
            String num = String.valueOf(number);
            int skip = place+1;
            String sub = str.substring(i+skip);
             if (number == 0) {

                str = sub;

            } else {

                str = ch + String.valueOf(number) + sub;

            }
            return ch;

        }
        return ' ';
    }
    
    public boolean hasNext() {
        return !str.isEmpty();
    }
}

/**
 * Your StringIterator object will be instantiated and called as such:
 * StringIterator obj = new StringIterator(compressedString);
 * char param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */
