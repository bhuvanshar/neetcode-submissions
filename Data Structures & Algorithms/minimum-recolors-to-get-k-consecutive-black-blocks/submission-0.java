class Solution {
    public int minimumRecolors(String blocks, int k) {
        if(k > blocks.length())return -1;

        int l = 0;
        int r = k;
        int bcount = 0;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<k;i++){
            if(blocks.charAt(i) == 'B')bcount++;
            min = Math.min(min, k-bcount);
        }
        
        while(r < blocks.length()){
            min = Math.min(min, k-bcount);
            if(blocks.charAt(l) == 'B')bcount--;
            if(blocks.charAt(r) == 'B')bcount++;
            r++;
            l++;
        }
        return min;
    }
}