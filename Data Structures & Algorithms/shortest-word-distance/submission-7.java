class Solution {
    public int shortestDistance(String[] wordsDict, String word1, String word2) {
        int idx1=0;
        int idx2 = 0;
        int min = Integer.MAX_VALUE;
        boolean ch1 = false;
        boolean ch2 = false;
        for(int i=0;i<wordsDict.length;i++){
            if(wordsDict[i].equals(word1)){
                idx1 = i;
                ch1 = true;
            }else if(wordsDict[i].equals(word2)){
                idx2 = i;
                ch2 = true;
            }else continue;
            if(ch1 && ch2)
                min = Math.min(min, Math.abs(idx2 - idx1));
        }

        // if(idx1 < idx2)return idx2 - idx1;
        // else return idx1 - idx2;

        return Math.abs(min);
        
    }
}
