class Solution {
    public int[][] highFive(int[][] items) {
        // Create a Priority Queue that sorts by ID (ascending) 
        // and then by Score (descending) so the highest scores come out first.
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> {
            if (a[0] == b[0]) {
                return Integer.compare(b[1], a[1]); // Descending score
            }
            return Integer.compare(a[0], b[0]);     // Ascending ID
        });

        // Add all students and their scores to the priority queue
        for (int[] item : items) {
            pq.offer(item);
        }

        List<int[]> resultList = new ArrayList<>();

        // Process the queue
        while (!pq.isEmpty()) {
            int studentId = pq.peek()[0];
            int sum = 0;
            
            // Extract the top 5 scores for this student
            for (int i = 0; i < 5; i++) {
                sum += pq.poll()[1];
            }
            
            // Calculate average and add to our result list
            resultList.add(new int[]{studentId, sum / 5});
            
            // Discard any remaining scores for this same student
            while (!pq.isEmpty() && pq.peek()[0] == studentId) {
                pq.poll();
            }
        }

        // Convert the dynamic list back to a 2D array for the final answer
        int[][] result = new int[resultList.size()][2];
        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i);
        }
        
        return result;
    }
}