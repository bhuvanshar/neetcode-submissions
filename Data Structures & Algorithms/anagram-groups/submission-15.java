class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>>map = new HashMap<>();

        for(String s: strs){
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String sortedString = new String(chars);
            map.computeIfAbsent(sortedString, k->new ArrayList<>()).add(s);
        }
        List<List<String>> res = new ArrayList<>();
        for(Map.Entry<String, List<String>>m : map.entrySet()){
            res.add(m.getValue());
        }
        return res;
    }
}
