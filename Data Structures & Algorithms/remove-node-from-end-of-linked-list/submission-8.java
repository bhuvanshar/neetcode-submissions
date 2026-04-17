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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size = 0;
        ListNode s = head;
        while(s!= null){
            s = s.next;
            size++;
        }
        if(size <= 1)return null;
        ListNode rem = head;
        ListNode ans = rem;
        int indexOfNodeToBeRemoved = size-n;
        int i=0;
        System.out.println(indexOfNodeToBeRemoved);
        if(indexOfNodeToBeRemoved == 0){
            return head.next;
        }
        while(i < indexOfNodeToBeRemoved-1){
            rem = rem.next;
            i++;
        }
        System.out.println(rem.val);
        rem.next = rem.next.next;
        return ans ;
    }
}
