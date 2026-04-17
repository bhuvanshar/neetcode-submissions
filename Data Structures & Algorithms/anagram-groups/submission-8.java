class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(String s : strs){
            char [] ch = s.toCharArray();
            Arrays.sort(ch);
            String newString = new String(ch);
            if(map.containsKey(newString)){
                List<String> ls = map.get(newString);
                ls.add(s);
                map.put(newString, ls);
            }else{
                List<String> ls =  new ArrayList<>();
                ls.add(s);
                map.put(newString, ls);
            }
        }
        List<List<String>> res = new ArrayList<>();
        for(Map.Entry<String, List<String>> m : map.entrySet()){
            res.add(m.getValue());
        }
        return res;
    }
}
