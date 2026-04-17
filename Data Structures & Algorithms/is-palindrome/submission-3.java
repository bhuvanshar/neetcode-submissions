class Solution {

    public boolean palin(String s){

        int left = 0;
        int right = s.length()-1;
        while(left<right){
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right)))
            return false;

            left++;
            right--;
        }
        return true;
    }
    public boolean isPalindrome(String s) {
        String [] ArrayString = s.split("\\s+");
        StringBuilder newString = new StringBuilder("");
        for(String g : ArrayString){
            newString.append(g);
        }
        // System.out.println(g);
        return palin(newString.toString().replaceAll("[^\\p{Alnum}]", ""));
    }
}
