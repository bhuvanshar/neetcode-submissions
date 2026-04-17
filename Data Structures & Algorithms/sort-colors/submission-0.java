class Solution {
    public void sortColors(int[] nums) {
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        for(int n : nums){
            switch(n){
                case 0:
                    count0++;
                    break;
                case 1:
                    count1++;
                    break;
                case 2:
                    count2++;
                    break;
                default:
                    break;
            }
        }

        int len = count0+count1+count2;
        int i=0;
        // for(int i=0;i<nums.length;i++){
            while(count0 != 0){
                nums[i] = 0;
                count0--;
                i++;
            }
            while(count1 != 0){
                nums[i] = 1;
                count1--;
                i++;
            }
            while(count2 != 0){
                nums[i] = 2;
                count2--;
                i++;
            }
        }
    }
// }