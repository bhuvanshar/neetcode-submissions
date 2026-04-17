class Solution {
    boolean isClosingTag(Character c){
        if(c == ']' || c == '}' || c == ')')
        return true;
        else
        return false;
    }
    public boolean isValid(String s) {
       Map<Character, Character> tagMap = new HashMap<>();
        tagMap.put(']','[');
        tagMap.put(')','(');
        tagMap.put('}','{');
        if(s.isEmpty()){
            return true;
        }
        if(tagMap.containsKey(s.charAt(0)))
            return false;
        Stack<Character>stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(tagMap.containsValue(s.charAt(i))){
                stack.push(s.charAt(i));
            }else{
                if(!stack.isEmpty() && stack.peek() == tagMap.get(s.charAt(i))){
                    stack.pop();
                }else{
                    return false;
                }
            }
        }
        if(stack.isEmpty())
            return true;
        else return false;
    }
}
