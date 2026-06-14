class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> map = new HashMap<>();
        map.put('}', '{');
        map.put(')', '(');
        map.put(']', '[');
        Stack<Character> stack = new Stack<>();
        for (int i = s.length()-1 ;i >=0 ;i--){
            if(map.containsKey(s.charAt(i))){
                stack.add(s.charAt(i));
            }else{
                if(stack.isEmpty() || map.get(stack.peek()) != s.charAt(i)){
                    return false;
                }else{
                    stack.pop();
                }
            }
        }
        return stack.isEmpty();
    }
}
