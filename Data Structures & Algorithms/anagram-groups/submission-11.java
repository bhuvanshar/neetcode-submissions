class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for(String s : strs){
            char [] c = s.toCharArray();
            Arrays.sort(c);
            String newC = new String(c);
            map.computeIfAbsent(newC, k->new ArrayList<>()).add(s);
        }
        List<List<String>> res = new ArrayList<>(map.values());

        return res;
    }
}
