class Solution {
    public int minOperations(String s) {
        int n = s.length();
        StringBuilder one = new StringBuilder();
        StringBuilder zero = new StringBuilder();

        boolean flip = true;

        for(int i=0;i<n;i++){
            one.append(flip ? "1" : "0");
            zero.append(!flip ? "1" : "0");
            flip = !flip;
        }

        int oneMin = 0;
        int zeroMin = 0;
        int min = 0;
        for(int i=0;i<one.toString().length(); i++){
            int x = s.charAt(i) ^ one.charAt(i);
            int y = s.charAt(i) ^ zero.charAt(i);
            if(x != 0)oneMin++;
            if(y != 0)zeroMin++;

            min = Math.min(oneMin, zeroMin);

        }
        return min;
    }
}