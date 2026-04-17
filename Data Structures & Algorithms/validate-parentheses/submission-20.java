class Solution {
    public boolean isValid(String s) {
        Map<Character,Character> map = new HashMap<>();
        map.put(']', '[');
        map.put('}', '{');
        map.put(')', '(');
        Stack<Character>st = new Stack();
        for(Character c : s.toCharArray()){
           if(map.containsKey(c)){
            if(st.isEmpty()){
                return false;
            }else{
                if(st.peek() == map.get(c)){
                    st.pop();
                }else{
                    return false;
                }
            }
           }else{
            st.push(c);
           }
        }
        return st.isEmpty();
    }
}
