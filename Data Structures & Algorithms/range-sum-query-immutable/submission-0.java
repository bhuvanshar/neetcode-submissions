class NumArray {
    int [] n;
    public NumArray(int[] nums) {
        this.n = nums;
    }
    
    public int sumRange(int left, int right) {
        int s = 0;
        for(int i=left; i<= right; i++){
            s += this.n[i];
        }
        return s;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */