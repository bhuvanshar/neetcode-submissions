class Solution {
    
    

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
           Arrays.sort(nums);
           for(int j = 0; j<nums.length; j++){
            if (j > 0 && nums[j] == nums[j - 1]) continue;
               int i = j+1;
               int k = nums.length-1;
               List<Integer> temp = new ArrayList<>();
               while(i < k){
                   if(nums[i]+nums[j]+nums[k] < 0){
                       i++;
                   }else if(nums[i]+nums[j]+nums[k] > 0){
                       k--;
                   }else{
                       result.add(Arrays.asList(nums[i], nums[j],nums[k]));
                       i++; k--;
                       while(i<k && nums[i] == nums[i-1])i++;
                   }
               }
           }
            // Set<List<Integer>>setList = new HashSet<>(result);

            // return new ArrayList<>(setList);
            return result;

    }
}
