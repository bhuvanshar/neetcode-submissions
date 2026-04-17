class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
            int [] result = new int [2];
            int right = numbers.length - 1;
            while (left < right) {
                int x = numbers[left] + numbers[right];
                if(x < target){
                    left++;
                }else if(x > target){
                    right--;
                }else{
                    result[0] = left+1;
                    result[1] = right+1;
                    break;
                }
            }
            return result;
    }
}
