class FirstUnique {
    Map<Integer, Integer> freqMap = new HashMap<>();
    List<Integer> arr = new ArrayList<>();
    public FirstUnique(int[] nums) {
        for(int n : nums){
            freqMap.put(n, freqMap.getOrDefault(n, 0)+1);
            arr.add(n);
        }
    }
    
    public int showFirstUnique() {
        for(int n : arr){
            if(freqMap.get(n) == 1)return n;
        }
        return -1;
    }
    
    public void add(int n) {
        freqMap.put(n, freqMap.getOrDefault(n, 0)+1);
        arr.add(n);
    }
}

/**
 * Your FirstUnique object will be instantiated and called as such:
 * FirstUnique obj = new FirstUnique(nums);
 * int param_1 = obj.showFirstUnique();
 * obj.add(value);
 */
