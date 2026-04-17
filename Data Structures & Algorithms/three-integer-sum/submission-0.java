class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int f = 0;
        int s = 0;
        int t = 0;
        List<List<Integer>> result = new ArrayList<>();
        Set<List<Integer>> res = new HashSet<>();
        Arrays.sort(nums);
        for(int x = 0;x<nums.length;x++){
            int fp = x+1;
            int sp = nums.length-1;
            while(fp < sp){
                if(nums[fp] + nums[sp] + nums[x] < 0){
                    fp++;
                }else if(nums[fp] + nums[sp] + nums[x] > 0){
                    sp--;
                }else{
                    ArrayList<Integer> n = new ArrayList<>(Arrays.asList(nums[x],nums[fp],nums[sp]));
                    res.add(n);
                    // result.add(n);
                    fp++;
                }
            }
        }
        return new ArrayList<>(res);
    }
}
