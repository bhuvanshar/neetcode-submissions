class Solution {
    public int hammingWeight(int n) {
        int i=0;
        int count = 0;
        while(i<32){
            if(((1<<i) & n) != 0){
                count++;
            }
            i++;
        }
        return count;
    }
}
