/**
 * Definition for singly-linked list.
 * class ListNode {
 *     constructor(val = 0, next = null) {
 *         this.val = val;
 *         this.next = next;
 *     }
 * }
 */

class Solution {
    /**
     * @param {ListNode} head
     * @param {number} n
     * @return {ListNode}
     */
    removeNthFromEnd(head, n) {
        let sentinel = new ListNode();
        sentinel.next = head;

        let fast = sentinel;
        for(let i=0; i<n; i++){
            fast = fast.next;
        }

        let slow = sentinel;
        while(fast.next){
            slow = slow.next;
            fast = fast.next;
        } 
        slow.next = slow.next.next;

        return sentinel.next;
    }
}
