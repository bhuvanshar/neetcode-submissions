class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>>res = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for(String s : strs){
            char [] c = s.toCharArray();
            Arrays.sort(c);
            String ss = new String(c);
            String st = ss.toString();
            if(map.containsKey(st)){
                List<String>ls = map.get(st);
                ls.add(s);
                map.put(st,ls);
            }else{
                List<String>ls = new ArrayList<>();
                ls.add(s);
                map.put(st,ls);
            }
        }
        for(Map.Entry<String, List<String>> m : map.entrySet()){
            res.add(m.getValue());
        }
        return res;
    }
}
