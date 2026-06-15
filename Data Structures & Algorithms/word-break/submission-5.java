class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        Boolean [] memo = new Boolean[s.length()];
        return memo(s, wordDict, 0, memo);
    }
    public boolean solve(String s, List<String> dict, int i){
        if(i == s.length())return true;

        for(String word : dict){
            int len = word.length();
            if(i+len <= s.length() && s.substring(i, i+len).equals(word)){
                if(solve(s, dict, i+len)){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean memo(String s, List<String> dict, int i, Boolean [] memo){
        if(i == s.length())return true;
        if(memo[i] != null)return memo[i];

        for(String word : dict){
            int len = word.length();
            if(i + len <= s.length() && s.substring(i, i+len).equals(word)){
                if(memo(s, dict, i+len, memo)){
                    return memo[i] = true;
                }
            }
        }
        return memo[i] = false;
    }
}
