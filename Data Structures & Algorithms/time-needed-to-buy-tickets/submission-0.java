class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int n = tickets.length;
        Queue<Integer> queue = new LinkedList<>();
        for(int i=0;i<n;i++){
            queue.add(i);
        }
        int time = 0;
        while(!queue.isEmpty()){
            int curr = queue.poll();
            tickets[curr]--;
            time++;

            if(tickets[curr]==0){
                if(curr == k){
                    return time;
                }
            }else{
                queue.add(curr);
            }
        }
        return time;
    }
}