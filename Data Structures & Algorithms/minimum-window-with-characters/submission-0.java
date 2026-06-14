class Solution {
    public String minWindow(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        Map<Character, Integer> sMap = new HashMap<>();

        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int need = map.size();
        int have = 0;

        int l = 0;
        int min = Integer.MAX_VALUE;
        int start = 0;

        for (int r = 0; r < s.length(); r++) {
            char c = s.charAt(r);

            if (map.containsKey(c)) {
                sMap.put(c, sMap.getOrDefault(c, 0) + 1);

                if (sMap.get(c).intValue() == map.get(c).intValue()) {
                    have++;
                }
            }

            while (have == need) {
                int win = r - l + 1;

                if (win < min) {
                    min = win;
                    start = l;
                }

                char left = s.charAt(l);

                if (map.containsKey(left)) {
                    sMap.put(left, sMap.get(left) - 1);

                    if (sMap.get(left) < map.get(left)) {
                        have--;
                    }
                }

                l++;
            }
        }

        return min == Integer.MAX_VALUE ? "" : s.substring(start, start + min);
    }
}