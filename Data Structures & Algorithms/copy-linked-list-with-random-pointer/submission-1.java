/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head == null)return null;
        Node temp = new Node(head.val);
        Node t = head;
        Node ans = temp;
        while(t != null){
            t = t.next;
            if(t != null){
            temp.next = new Node(t.val);
            temp = temp.next;
            }
        }
        temp.next = null;
        t = ans;
        Node newT = head;
        Map<Node, Node> map = new HashMap<>();
        while(t != null){
            map.put(newT, t);
            t = t.next;
            newT = newT.next;
        }
        map.put(null,null);
        t = ans;
        newT = head;
        while(t!=null){
            t.random = map.get(newT.random);
            t = t.next;
            newT = newT.next;
        }
        return ans;
    }
}
