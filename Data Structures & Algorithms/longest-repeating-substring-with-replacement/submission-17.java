class Solution {
    //k - leastFrequentCharacter
    // leastFrequentCharacter = windowSize - majorityElement
    public int characterReplacement(String s, int k) {
        Map<Character, Integer> map = new HashMap<>();
        int l = 0;
        int maj = 0;
        int max = 0;
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), map.get(s.charAt(i)) +1);
                maj = Math.max(maj, map.get(s.charAt(i)));
                int win = i-l+1;
                if(k - win + maj < 0){
                    map.put(s.charAt(l), map.get(s.charAt(l)) - 1);
                    if(map.get(s.charAt(l)) == 0)map.remove(s.charAt(l));
                    l++;
                }else{
                    max = Math.max(max, win);
                }
            }else{
                map.put(s.charAt(i), 1);
                maj = Math.max(maj, map.get(s.charAt(i)));
                int win = i-l+1;
                if(k - win + maj < 0){
                    map.put(s.charAt(l), map.get(s.charAt(l)) - 1);
                    if(map.get(s.charAt(l)) == 0)map.remove(s.charAt(l));
                    l++;
                }else{
                    max = Math.max(max, win);
                }
            }

        }
        return max;
    }
}
