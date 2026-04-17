class Solution {
    public int[] twoSum(int[] nums, int target) {
if(nums.length == 0){
                        return new int [2];
                }
                int [] result = new int [2];

                Map<Integer,List<Integer>>map = new HashMap<>();
                for(int i=0;i<nums.length;i++){
                        map.computeIfAbsent(target-nums[i], k->new ArrayList<>()).add(i);
                }
                for(int i=0;i<nums.length;i++){
                        if(map.containsKey(nums[i])){
                                List<Integer>temp = map.get(nums[i]);
                                for(int x=0;x<temp.size();x++){
                                        if(temp.get(x) != i){
                                                result[0] = i;
                                                result[1] = temp.get(x);
                                                break;
                                        }
                                }
                        }
                }
                Arrays.sort(result);
                return result;
    }
}
