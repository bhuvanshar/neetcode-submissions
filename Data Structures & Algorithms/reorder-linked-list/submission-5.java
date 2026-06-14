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
    public ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        while(curr != null){
            ListNode nxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;
        }
        return prev;
    }
    public void reorderList(ListNode head) {
        ListNode t = head;
        int n = 0;
        while(t != null){
            t = t.next;
            n++;
        }
        t = head;
        int mid = n/2;
        int i =  0;
        while(i < n/2){
            t = t.next;
            i++;
        }
        ListNode rev = reverse(t.next);
        t.next = null;
        t = head;
        ListNode ans = t;
        while(t != null && rev != null){
            ListNode tNext = t.next;
            ListNode revNext = rev.next;
            t.next = rev;
            rev.next = tNext;
            t = tNext;
            rev = revNext;

    }
    }
}
