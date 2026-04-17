class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;

        Map<Character, Integer> m1 = new HashMap<>();
        Map<Character, Integer> m2 = new HashMap<>();
        for(int i=0;i<26;i++){
            m1.put((char)((int)'a' + i), 0);
            m2.put((char)((int)'a' + i), 0);
        }
        for(int i=0;i<s1.length();i++){
            m1.put(s1.charAt(i), m1.get(s1.charAt(i)) + 1);
            m2.put(s2.charAt(i), m2.get(s2.charAt(i)) + 1);
        }

        int match = 0;

        for(int i=0;i<26;i++){
            if(m2.get((char)((int)'a' + i)).equals(m1.get((char)((int)'a' + i)))){
                match++;
            }
        }
        int l = 0;
        int r = s1.length()-1;
        System.out.println(match);
        if(match == 26){
            return true;
        }
        while(r<s2.length()-1){
            char outChar = s2.charAt(l);
            int numOutChar = m2.get(outChar);
            l++;
            numOutChar--;
            m2.put(outChar, numOutChar);
            r++;
            char inChar = s2.charAt(r);
            int numInChar = m2.get(inChar);
            numInChar++;
            m2.put(inChar, numInChar);
            if(numOutChar + 1 == m1.get(outChar)){
                match--;
            }else if(numOutChar == m1.get(outChar)){
                match++;
            }

            if(numInChar - 1 == m1.get(inChar)){
                match--;
            }else if(numInChar == m1.get(inChar)){
                match++;
            }
            if(match == 26)return true;
        }
        System.out.println(match);
        return false;
    }
}
