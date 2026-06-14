class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int size = s1.length();
        int l = 0;
        int r = size-1;

        while(r < s2.length()){
            String word = s2.substring(l, r+1);
            char [] chars = word.toCharArray();
            char [] check = s1.toCharArray();
            Arrays.sort(chars);
            Arrays.sort(check);
            String next = new String(chars);
            String nextCheck = new String(check);
            if(next.equals(nextCheck)){
                return true;
            }else{
                r++;
                l++;
            }
        }
        return false;
    }
}
