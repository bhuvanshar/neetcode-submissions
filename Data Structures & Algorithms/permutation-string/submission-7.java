class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int size = s1.length();
        if(size > s2.length())return false;
        int l = 0;
        int r = size-1;
        int [] arr1 = new int [26];
        for(int i=0;i<s1.length();i++){
            arr1[s1.charAt(i) - 'a']++;
        }
        int [] arr2 = new int [26];
        for(int i=0;i<=r;i++){
            arr2[s2.charAt(i) - 'a']++;
        }
        while(r < s2.length()){
            if(Arrays.equals(arr1,arr2)){
                return true;
            }else{
                arr2[s2.charAt(l) - 'a']--;
                l++;
                r++;
                if(r < s2.length())
                arr2[s2.charAt(r) - 'a']++;
            }
        }
        return false;
    }
}
