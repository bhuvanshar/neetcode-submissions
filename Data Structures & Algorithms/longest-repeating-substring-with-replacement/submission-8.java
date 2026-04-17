class Solution {
    public int characterReplacement(String s, int k) {
      Map<Character, Integer> map = new HashMap<>();
        int maxf = Integer.MIN_VALUE;
        int result = 0;
        int l = 0;
      for(int i=0;i<s.length();i++){
        map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        maxf = Integer.max(maxf, map.get(s.charAt(i)));

        while(i-l+1-maxf > k){
            map.put(s.charAt(l), map.get(s.charAt(l)) - 1);
            l++;
        }
        result = Integer.max(result,i-l+1);
      }  
      return result;
    }
}
