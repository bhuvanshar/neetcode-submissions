class Solution {
    public int countElements(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for(int n : arr){
            set.add(n);
        }
        int count = 0;
        for(int i=0;i<arr.length;i++){
            int num = arr[i];
            if(set.contains(num+1)){
                count++;
            }
        }
        return count;
    }
}
