class Solution {
    
    

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
           Arrays.sort(nums);
           for(int j = 0; j<nums.length; j++){
               int i = j+1;
               int k = nums.length-1;
               List<Integer> temp = new ArrayList<>();
               while(i < k){
                   if(nums[i]+nums[j]+nums[k] < 0){
                       i++;
                   }else if(nums[i]+nums[j]+nums[k] > 0){
                       k--;
                   }else{
                       temp.add(nums[i]);
                       temp.add(nums[j]);
                       temp.add(nums[k]);
                       result.add(temp);
                       temp = new ArrayList<>();
                       i++; k--;
                   }
               }
           }
            Set<List<Integer>>setList = new HashSet<>(result);

            return new ArrayList<>(setList);

    }
}
