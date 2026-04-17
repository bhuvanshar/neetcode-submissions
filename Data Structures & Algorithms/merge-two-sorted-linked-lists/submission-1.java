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
ListNode newList = null;
        if(list1 != null && list2 != null)
        newList = list1.val <= list2.val ? list1 : list2;
        else
        return list1 == null ? list2 : list1;
        ListNode temp = newList;
        if(list1.val <= list2.val){
            list1 = list1.next;
        }else{
            list2 = list2.next;
        }
        while(list1 != null && list2 != null){
            ListNode nxt = new ListNode();
            if(list1.val <= list2.val){
                newList.next = list1;
                newList = newList.next;
                list1 = list1.next;
            }else{
                newList.next = list2;
                newList = newList.next;
                list2 = list2.next;
            }
        }

        while(list1 != null){
            newList.next = list1;
            newList = newList.next;
            list1 = list1.next;
        }

        while(list2 != null){
            newList.next = list2;
            newList = newList.next;
            list2 = list2.next;
        }

        return temp;
    }
}