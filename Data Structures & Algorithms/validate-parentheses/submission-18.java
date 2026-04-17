class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> map = new HashMap<>();
        map.put(']', '[');
        map.put('}', '{');
        map.put(')', '(');
        
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(st.isEmpty()){
                if(map.containsKey(s.charAt(i)))return false;
                else{
                    st.push(s.charAt(i));
                }
            }else{
                if(map.containsValue(s.charAt(i))){
                    st.push(s.charAt(i));
                }else{
                    if(map.get(s.charAt(i)) == st.peek()){
                        st.pop();
                    }else{
                        return false;
                    }
                }
            }
        }
        if(st.isEmpty()){
            return true;
        }else return false;
    }
}
