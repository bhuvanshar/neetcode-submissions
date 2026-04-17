/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode singleHop = head;
        ListNode doubleHop = head;

        while(singleHop != null && doubleHop != null && doubleHop.next != null){
            singleHop = singleHop.next;
            doubleHop = doubleHop.next.next;

            if(singleHop == doubleHop){
                return true;
            }
        }
        return false;
    }
}
