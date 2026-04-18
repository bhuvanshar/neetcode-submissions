class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        Map<String, ArrayList<String>> map = new HashMap<>();
        for(String s : strs){
            char [] c = s.toCharArray();
            Arrays.sort(c);
            String sortedString = new String(c);
            if(map.containsKey(sortedString.toString())){
                map.get(sortedString.toString()).add(s);
            }else{
                ArrayList<String> l = new ArrayList<>();
                l.add(s);
                map.put(sortedString.toString(), l);
            }
        }
        for(Map.Entry<String, ArrayList<String>> entry : map.entrySet()){
            res.add(entry.getValue());
        }
        return res;
    }
}
