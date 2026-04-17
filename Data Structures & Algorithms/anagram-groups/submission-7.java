class Solution {
    
    public List<List<String>> groupAnagrams(String[] strs) {
       List<List<String>>result = new ArrayList<>();
                Map<String, List<String>>map = new HashMap<>();
                for(int i=0;i<strs.length;i++){
                        char [] charArr = strs[i].toCharArray();
                        Arrays.sort(charArr);
                        String key = new String(charArr);
                        map.computeIfAbsent(key, k->new ArrayList<>()).add(strs[i]);
                }
                for(Map.Entry<String, List<String>>entry : map.entrySet()){
                        result.add(entry.getValue());
                }
                return result;
    }
}
