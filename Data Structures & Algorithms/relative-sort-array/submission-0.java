class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        List<Integer> res = new ArrayList<>();
        for(int i=0;i<arr2.length;i++){
            for(int j=0;j<arr1.length;j++){
                if(arr1[j] == arr2[i]){
                    res.add(arr1[j]);
                    arr1[j] = -1;
                }
            }
        }
        Arrays.sort(arr1);
        int i = 0;
        while(i < arr1.length && arr1[i] == -1){
            arr1[i] = res.get(i);
            i++;
        }
        return arr1;
    }
}