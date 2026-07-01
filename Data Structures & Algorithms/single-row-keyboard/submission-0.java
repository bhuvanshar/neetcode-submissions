class Solution {
    public int calculateTime(String keyboard, String word) {
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0;i<keyboard.length();i++){
            map.put(keyboard.charAt(i), i);
        }
        int index = 0;
        int time = 0;
        for(char c : word.toCharArray()){
            time+=Math.abs(map.get(c)-index);
            index = map.get(c);
        }
        return time;
    }
}
