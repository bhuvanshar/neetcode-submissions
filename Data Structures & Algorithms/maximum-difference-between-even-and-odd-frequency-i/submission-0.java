class Solution {
    public int maxDifference(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0;i < s.toCharArray().length; i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        int maxOdd = Integer.MIN_VALUE;

        int minEven = Integer.MAX_VALUE;

        for (int freq : map.values()) {

            if (freq % 2 != 0) {

                maxOdd = Math.max(maxOdd, freq);

            } else {

                minEven = Math.min(minEven, freq);

            }

        }

        return maxOdd - minEven;
    }
}