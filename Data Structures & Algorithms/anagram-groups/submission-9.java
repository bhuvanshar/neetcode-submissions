class Solution {
    
    public List<List<String>> groupAnagrams(String[] strs) {
       List<List<String>> res = new ArrayList<>();
        Map<String, List<String>>map = new HashMap<>();

        for(String s : strs){
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String newStr = new String(charArray);
            if(map.containsKey(newStr)){
                List<String>ls = map.get(newStr);
                ls.add(s);
                map.put(newStr, ls);
            }else{
                List<String>ls = new ArrayList<>();
                ls.add(s);
                map.put(newStr,ls);
            }
        }
        for(Map.Entry<String, List<String>> m : map.entrySet()){
            res.add(m.getValue());
        }
        return res;
    }
}
