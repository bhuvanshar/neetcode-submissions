class Solution {
    public String customSortString(String order, String s) {
        String [] str = s.split("");
        StringBuilder res = new StringBuilder();
        for(int i=0;i<order.length();i++){
            for(int j=0;j<str.length;j++){
                if(Character.toString(order.charAt(i)).equals(str[j])){
                    res.append(str[j]);
                    str[j] = "#";
                }
            }
        }
        for(int i=0;i<str.length;i++){
            if(!str[i].equals("#")){
                res.append(str[i]);
            }
        }
        return res.toString();
    }
}