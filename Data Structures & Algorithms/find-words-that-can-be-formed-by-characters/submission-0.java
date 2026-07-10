class Solution {
    public int countCharacters(String[] words, String chars) {
        Map<Character, Integer> map = new HashMap<>();
        Map<Character, Integer> subMap = new HashMap<>();
        int count = 0;
        for(char c : chars.toCharArray()){
            map.put(c, map.getOrDefault(c,0) + 1);
        }
        for(int i=0;i<words.length;i++){
            boolean valid = true;
            subMap = formMap(words[i]);
            for(Map.Entry<Character, Integer> entry : subMap.entrySet()){
                if(map.containsKey(entry.getKey())){
                    if(map.get(entry.getKey()) < entry.getValue()){
                        valid = false;
                        break;
                    }
                }else{
                    valid = false;
                    break;
                }
            }
            System.out.println(words[i]);
            if(valid)
                count += words[i].length();
        }
        return count;
    }

    public Map<Character, Integer> formMap(String word){
        Map<Character, Integer> map = new HashMap<>();
        for(char c : word.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
        }
        return map;
    }
}