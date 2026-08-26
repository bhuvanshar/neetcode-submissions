class Solution {
    public boolean areSentencesSimilar(String[] sentence1, String[] sentence2, List<List<String>> similarPairs) {
        Map<String, Set<String>> map = new HashMap<>();
        if(sentence1.length!=sentence2.length)return false;

        for(List<String> ls : similarPairs){
            map.computeIfAbsent(ls.get(0), k->new HashSet<String>()).add(ls.get(1));
            map.computeIfAbsent(ls.get(1), k->new HashSet<String>()).add(ls.get(0));
        }

        for(int i=0;i<sentence1.length;i++){
            if(sentence1[i].equals(sentence2[i])){
                continue;
            }

            if(map.containsKey(sentence1[i]) && map.get(sentence1[i]).contains(sentence2[i])){
                continue;
            }
            return false;
        }
        return true;
    }
}
