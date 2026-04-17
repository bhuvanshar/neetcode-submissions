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
        Node clone = new Node(head.val);
        Node temp = clone;
        Node itr = head.next;
        Map<Node, Node> map = new HashMap<>();
        map.put(head, temp);
        while(itr != null){
            Node newNode = new Node(itr.val);
            map.put(itr, newNode);
            temp.next = newNode;
            itr = itr.next;
            temp = temp.next;
        }
        map.put(null, null);
        // int i=0;
        // Map<Integer, Node>randomMap = new HashMap<>();
        // Node temp2 = head;
        // while(temp2!=null){
        //     randomMap.put(i, map.get(temp2.random));
        //     i++;
        //     temp2 = temp2.next;
        // }

        Node temp3 = clone;
        Node t4 = head;
        // Node ans = temp3;
        // i = 0;
        while(temp3 != null){
            temp3.random = map.get(t4.random);
            // i++;
            temp3 = temp3.next;
            t4 = t4.next;
        }
        return clone;
    }
}
