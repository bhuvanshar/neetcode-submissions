class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int [] res = new int [nums1.length];
        for(int i=0;i<nums1.length;i++){
            int indexJ = -1;
            for(int j=0;j<nums2.length;j++){
                if(nums1[i] == nums2[j]){
                    indexJ = j;
                    break;
                }
            }
            int ans = -1;
            for(int k=indexJ;k<nums2.length;k++){
                if(nums2[k] > nums2[indexJ]){
                    ans = nums2[k];
                    break;
                }
            }
            res[i] = ans;
        }
        return res;
    }
}