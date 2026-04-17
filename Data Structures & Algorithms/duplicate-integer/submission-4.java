// import java.util.Collections;
class Solution {
    public boolean hasDuplicate(int[] nums) {
        int [] countingArray = new int[nums.length];


Map<Integer, Integer> map  = new HashMap<>();

for(int i=0;i<nums.length;i++){
    map.put(nums[i], map.getOrDefault(nums[i], 0) +1);
}

for(Map.Entry<Integer, Integer> entry : map.entrySet()){
        if(entry.getValue() > 1){
            return true;
        }
}
return false;
    }
}