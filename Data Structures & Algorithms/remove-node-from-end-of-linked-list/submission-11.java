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
        ListNode t = head;
    int size = 0;
    while(t != null){
        t = t.next;
        size++;
    }
    if(size - n == 0){
        head = head.next;
        return head;
    }
    t = head;
    int i = 0;
    while(i < size - n - 1){
        t = t.next;
        i++;
    }
    t.next = t.next.next;
    
    return head;
    }
}
