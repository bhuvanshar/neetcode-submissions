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
        Map<Node, Node> map = new HashMap<>();
        Node temp = head;
        while(temp != null){
            Node newNode = new Node(temp.val);
            map.put(temp, newNode);
            temp = temp.next;
        }
        for(Map.Entry<Node, Node> entry : map.entrySet()){
            Node random = entry.getKey().random;
            Node nxt = entry.getKey().next;
            Node newRandom = map.get(random);
            Node newNxt = map.get(nxt);
            entry.getValue().random = newRandom;
            entry.getValue().next = newNxt;
        }
        return map.get(head);
    }
}
