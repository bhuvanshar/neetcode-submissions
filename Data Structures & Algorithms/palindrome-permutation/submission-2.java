class Solution {
    public boolean canPermutePalindrome(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)+1);
        }
        int count = 0;
        for(Map.Entry<Character,Integer>entry : map.entrySet()){
            count += entry.getValue()%2;
        }
        return count <= 1 ? true : false;
    }
}
