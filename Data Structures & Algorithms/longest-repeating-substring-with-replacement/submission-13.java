class Solution {
    public int dominant(Map<Character, Integer>map){
                int max = 0;
                for(Map.Entry<Character, Integer>entry : map.entrySet()){
                        max = Math.max(entry.getValue(), max);
                }
                return max;
        }
    public int characterReplacement(String s, int k) {
        if(s.isEmpty()){
                        return 0;
                }
        Map<Character, Integer>map = new HashMap<>();
                int l = 0;
                int r = 0;
                int maxSize = 0;
                while(r < s.length()){

                        if(map.containsKey(s.charAt(r))){
                                map.put(s.charAt(r), map.get(s.charAt(r)) + 1);
                        }else{
                                map.put(s.charAt(r), 1);
                        }
                        int windowSize = r-l+1;
                        while(windowSize - dominant(map) > k){
                                if(map.get(s.charAt(l)) == 1)
                                        map.remove(s.charAt(l));
                                else map.put(s.charAt(l), map.get(s.charAt(l)) - 1);
                                l++;
                                windowSize = r-l+1;
                        }
                        maxSize = Math.max(maxSize, windowSize);

                        r++;

                }
                return maxSize;
    }
}
