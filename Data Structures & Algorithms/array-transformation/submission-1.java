class Solution {
    public List<Integer> transformArray(int[] ar) {
        int [] arr = ar.clone();
        while(true){
            int [] snapshot = arr.clone();

            for(int i=1;i<arr.length-1;i++){
            int prev = snapshot[i-1];
            int next = snapshot[i+1];
            int curr = snapshot[i];
            if(curr < next && curr < prev){
                arr[i]++;
            }else if(curr > next && curr > prev){
                arr[i]--;
            }
        }
        if(Arrays.equals(snapshot, arr))break;
        }
        
        return Arrays.stream(arr)

        .boxed()

        .toList();
    }
}
