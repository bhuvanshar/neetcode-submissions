class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(String s : strs){
            char [] ch = s.toCharArray();
            Arrays.sort(ch);
            String ss = new String(ch);
            if(map.containsKey(ss)){
                List<String> ls = map.get(ss);
                ls.add(s);
            }else{
                List<String> ls = new ArrayList<>();
                ls.add(s);
                map.put(ss, ls);
            }
        }
        List<List<String>> ans = new ArrayList<>();
        for(Map.Entry<String, List<String>> m : map.entrySet()){
            ans.add(m.getValue());
        }
        return ans;
    }
}
