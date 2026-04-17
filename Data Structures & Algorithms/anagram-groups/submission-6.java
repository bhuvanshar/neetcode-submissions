class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        int i=0;
        List<List<String>> res = new ArrayList<>();
        for(String s : strs){
            char [] c = s.toCharArray();
            Arrays.sort(c);
            String st = new String(c);
            if(map.containsKey(st)){
                map.put(st, map.get(st)).add(strs[i]);
            }else{
                map.put(st, new ArrayList<>(Arrays.asList(strs[i])));
            }
            i++;
        }
        for(Map.Entry<String, List<String>>entry : map.entrySet()){
            res.add(entry.getValue());
        }
        return res;
    }
}
