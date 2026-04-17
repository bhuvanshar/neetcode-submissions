class Solution {
    boolean isClosingTag(Character c){
        if(c == ']' || c == '}' || c == ')')
        return true;
        else
        return false;
    }
    public boolean isValid(String s) {
        HashMap<Character, Character> map = new HashMap<>();
        map.put('[', ']');
        map.put('{', '}');
        map.put('(', ')');
        // HashMap<Character, Character> map2 = new HashMap<>();
        map.put(']', '[');
        map.put('}', '{');
        map.put(')', '(');

        // HashSet<Character> closingSet = new HashSet<>(']','}',')');
        // HashSet<Character> openingSet = new HashSet<>('[','{','(');

        Stack<Character> st = new Stack<>();
        st.push(s.charAt(0));

        for(int i=1;i<s.length();i++){
            if(st.size() > 0 &&  map.get(s.charAt(i)) == st.peek()){
                if(isClosingTag(s.charAt(i)))
                st.pop();
                else
                return false;
            }else{
                st.push(s.charAt(i));
            }
        }
        if(st.size() == 0){
            return true;
        }else{
            return false;
        }
    }
}
