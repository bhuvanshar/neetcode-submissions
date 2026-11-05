/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public boolean canAttendMeetings(List<Interval> intervals) {
        Queue<Interval> pq = new PriorityQueue<>((a,b) -> Integer.compare(a.start, b.start));
        for(Interval i : intervals){
            pq.offer(i);
        }
        while(pq.size()>1){
            Interval i = pq.poll();
            Interval si = pq.poll();
            if(i.end > si.start){
                return false;
            }
            pq.offer(si);
        }
        return true;
    }
}
