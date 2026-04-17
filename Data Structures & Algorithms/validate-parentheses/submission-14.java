class Solution {
    public boolean isValid(String s) {
        HashMap<Character, Character> map = new HashMap<>() {
                {
                    put('{', '}');
                    put('(', ')');
                    put('[', ']');
                }
            };
            Stack<Character> stack = new Stack<>();
            for (int i = 0; i < s.length(); i++) {
                if (map.containsKey(s.charAt(i))) {
                    stack.push(s.charAt(i));
                } else {
                    if (!stack.isEmpty() && map.get(stack.peek()) == s.charAt(i)) {
                        stack.pop();
                    } else {
                        return false;
                    }
                }
            }
            return stack.isEmpty();
    }
}
