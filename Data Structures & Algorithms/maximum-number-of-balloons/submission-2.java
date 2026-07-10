class Solution {
    public int maxNumberOfBalloons(String text) {
        String s = "balloon";
        Map<Character, Integer> mapT = new HashMap<>();
        for(int i=0;i<s.length();i++){
            mapT.put(s.charAt(i), mapT.getOrDefault(s.charAt(i), 0) + 1);
        }
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i), 0);
        }
        int min = Integer.MAX_VALUE;
        for(int i=0;i<text.length();i++){
            if(map.containsKey(text.charAt(i))){
                map.put(text.charAt(i), map.get(text.charAt(i)) + 1);
            }
        }
        for(Map.Entry<Character, Integer> m : map.entrySet()){
            if(m.getValue() >= mapT.get(m.getKey())){
                min = Math.min(m.getValue()/mapT.get(m.getKey()), min);
            }
            else return 0;
        }
        return min;
    }
}