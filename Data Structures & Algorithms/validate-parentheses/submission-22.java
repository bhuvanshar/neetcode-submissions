class Solution {
    public boolean isValid(String s) {
        if(s.length() == 0)return false;
        Map<Character, Character> map = new HashMap<>();
        map.put(']','[');
        map.put(')','(');
        map.put('}','{');

        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(map.containsValue(s.charAt(i))){
                st.push(s.charAt(i));
            }else{
                if(!st.isEmpty() && st.peek() == map.get(s.charAt(i))){
                    st.pop();
                }else{
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
}
