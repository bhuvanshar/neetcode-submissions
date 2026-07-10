class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map<Character, String> map = new HashMap<>();
        Map<String, Character> revMap = new HashMap<>();

        String[] str = s.split(" ");

        if (str.length != pattern.length()) return false;

        for (int i = 0; i < pattern.length(); i++) {
            char ch = pattern.charAt(i);
            String word = str[i];

            if (map.containsKey(ch)) {
                if (!map.get(ch).equals(word)) {
                    return false;
                }
            } else {
                if (revMap.containsKey(word)) {
                    return false;
                }

                map.put(ch, word);
                revMap.put(word, ch);
            }
        }

        return true;
    }
}