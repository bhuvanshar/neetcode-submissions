class Solution {
    public String hashKey(String s){
        StringBuilder sb = new StringBuilder();
        for(int i=1;i<s.length();i++){
            sb.append((char)((s.charAt(i) - s.charAt(i-1)) + 26)%26 + 'a');
        }
        return sb.toString();
    }
    public List<List<String>> groupStrings(String[] strings) {
        Map<String, List<String>> map = new HashMap<>();
        for(String s : strings){
            String key = hashKey(s);
            if(map.containsKey(key)){
                List<String> ls = map.get(key);
                ls.add(s);
                map.put(key, ls);
            }else{
                List<String> ls = new ArrayList<>();
                ls.add(s);
                map.put(key, ls);
            }
        }
        List<List<String>> res = new ArrayList<>();
        for(List<String> l : map.values()){
            res.add(l);
        }
        return res;
    }
}
