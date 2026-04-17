class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l = 0;
        if(numbers.length == 0)return new int [2];
        int r = numbers.length-1;
        int [] res = new int [2];
        while(l < r){
            int sum = numbers[l] + numbers[r];
            if(sum < target){
                l++;
            }else if(sum > target){
                r--;
            }else{
                res[0] = l+1;
                res[1] = r+1;
                break;
            }
        }
        return res;
    }
}
