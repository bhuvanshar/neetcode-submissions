class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>>result = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for(int i=0;i<strs.length;i++){
            String word = strs[i];
            char [] chars = word.toCharArray();

            Arrays.sort(chars);
            String wordKey = new String(chars); 
            if(map.containsKey(wordKey.toString())){
                List<String> ls = map.get(wordKey);
                ls.add(word);
                map.put(wordKey, ls);
            }else{
                List<String> ls = new ArrayList<>();
                ls.add(word);
                map.put(wordKey, ls);
            }

        }
        for(Map.Entry<String, List<String>> m : map.entrySet()){
            result.add(m.getValue());
        }
        return result;
    }
}
