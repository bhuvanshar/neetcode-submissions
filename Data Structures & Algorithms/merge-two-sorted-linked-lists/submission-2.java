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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null)return list2;
        if(list2 == null)return list1;
        if(list2 == null && list1 == null)return new ListNode();
        ListNode l1 = list1;
        ListNode l2 = list2;
        ListNode ans = new ListNode();
        if(l1.val <= l2.val){
            ListNode res = new ListNode(l1.val);
            ans = res;
            l1 = l1.next;
            while(l1 != null && l2 != null){
                if(l1.val <= l2.val){
                    res.next = l1;
                    l1 = l1.next;
                    res = res.next;
                }else{
                    res.next = l2;
                    l2 = l2.next;
                    res = res.next;
                }
            }

            while(l1 != null){
                res.next=l1;
                l1 = l1.next;
                res = res.next;
            }
            while(l2 != null){
                res.next=l2;
                l2 = l2.next;
                res = res.next;
            }
        }else{
            ListNode res = new ListNode(l2.val);
            ans = res;
            l2 = l2.next;
            while(l1 != null && l2 != null){
                if(l1.val <= l2.val){
                    res.next = l1;
                    l1 = l1.next;
                    res = res.next;
                }else{
                    res.next = l2;
                    l2 = l2.next;
                    res = res.next;
                }
            }

            while(l1 != null){
                res.next=l1;
                l1 = l1.next;
                res = res.next;
            }
            while(l2 != null){
                res.next=l2;
                l2 = l2.next;
                res = res.next;
            }
        }
        return ans;
    }
}