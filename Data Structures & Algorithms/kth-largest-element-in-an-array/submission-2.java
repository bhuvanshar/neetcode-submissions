class Solution {
    public int findKthLargest(int[] nums, int k) {
        if(nums.length == 0)return -1;
        Queue<Integer>maxHeap = new PriorityQueue<>((a, b) -> Integer.compare(b, a));
        for(int x : nums){
            maxHeap.add(x);
        }
        int i=1;
        while(!maxHeap.isEmpty()){
            if(i == k){
                return maxHeap.poll();
            }else{
                i++;
                maxHeap.poll();
            }
        }
        return -1;
    }
}
