class Solution {
    public int[] sortArray(int[] nums) {
        Queue<Integer> q = new PriorityQueue<>((a,b)->Integer.compare(a,b));
        for(int n : nums){
            q.offer(n);
        }
        for(int i=0;i<nums.length;i++){
            nums[i] = q.poll();
        }
        return nums;
    }
}