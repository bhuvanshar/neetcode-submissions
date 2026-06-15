class Solution {
    List<List<String>> res = new ArrayList<>();
    List<String> part = new ArrayList<>();
    public List<List<String>> partition(String s) {
        dfs(s, 0);
        return res;
    }

    public void dfs(String s, int i){
        if(i >= s.length()){
            res.add(new ArrayList<>(part));
            return;
        }

        for(int j=i;j<s.length();j++){
            if(isPalin(s, i, j)){
                part.add(s.substring(i, j+1));
                dfs(s, j+1);
                part.remove(part.size()-1);
            }
        }
    }
    public boolean isPalin(String s, int i, int j){
        while(i < j){
            if(s.charAt(i) != s.charAt(j))
                return false;
                i++;j--;
        }
        return true;
    }
}
 