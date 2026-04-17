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
    public ListNode reverseList(ListNode head){
        ListNode curr = head;
        ListNode prev = null;
        while(curr != null){
            ListNode nxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;
        }
        return prev;
    }
    public void reorderList(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode rightList = reverseList(slow.next);
        ListNode leftList = head;
        slow.next = null;
        ListNode temp = head;
        leftList = leftList.next;

        while(rightList!=null && leftList!=null){
            temp.next = rightList;
            rightList = rightList.next;
            temp = temp.next;
            temp.next = leftList;
            leftList = leftList.next;
            temp = temp.next;
        }
    }
}
