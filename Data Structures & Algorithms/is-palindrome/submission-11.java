class Solution {
    public boolean isPalindrome(String s) {
        String[] stringSplit = s.split(" ");
            StringBuilder str = new StringBuilder("");
            for(int i=0;i<stringSplit.length;i++){
                str.append(stringSplit[i]);
            }
            int left = 0;
            // int right = str.length()-1;
            String lowercase = str.toString().toLowerCase().replaceAll("[^a-zA-Z0-9 ]", "").trim();
            int right = lowercase.length()-1;
            while(left<=right){
                if(lowercase.charAt(left) == lowercase.charAt(right)){
                    left++;
                    right--;
                }else{
                    return false;
                }
            }
            return true;
    }
}
