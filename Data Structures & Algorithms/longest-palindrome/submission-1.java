class Solution {
    public int longestPalindrome(String s) {
        Map<Character, Integer> count = new HashMap<>();
        int res = 0;

        for (char c : s.toCharArray()) {
            count.put(c, count.getOrDefault(c, 0) + 1);
            if (count.get(c) % 2 == 0) {
                res += 2;
            }
        }

        for (int cnt : count.values()) {
            if (cnt % 2 == 1) {
                res += 1;
                break;
            }
        }

        return res;
    }
}