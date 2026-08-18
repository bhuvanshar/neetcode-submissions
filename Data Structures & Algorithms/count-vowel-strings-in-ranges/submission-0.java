class Solution {
    private static final Set<Character> VOWELS = Set.of('a', 'e', 'i', 'o', 'u');
    public boolean endsWithVowel(String s) {

        return VOWELS.contains(s.charAt(0)) && VOWELS.contains(s.charAt(s.length() - 1));

        }
    public int[] vowelStrings(String[] words, int[][] queries) {
        int [] res = new int [queries.length];
        int x = 0;
        for(int [] q : queries){
            int start = q[0];
            int end = q[1];
            int count = 0;
            for(int i=start; i<=end;i++){
                if(endsWithVowel(words[i])){
                    count++;
                }
            }
            res[x] = count;
            x++;
        }
        return res;
    }
}
