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
    public Node copyRandomList(Node node) {
        if(node == null)return null;
                Map<Integer, Integer>indexMap = new HashMap<>();
                Map<Node, Integer>map = new HashMap<>();
                Node pointer = node;
                int i=0;
                while(pointer!=null){
                        map.put(pointer, i);
                        i++;
                        pointer = pointer.next;
                }
                i++;
                map.put(null, i);
                pointer = node;
                i = 0;
                while(pointer!=null){
                        indexMap.put(i,map.get(pointer.random));
                        i++;
                        pointer = pointer.next;
                }
                i = 0;
                Map<Integer, Node>cloneMap = new HashMap<>();
                Node dummy = new Node(0);
                Node temp = dummy;
                Node curr = node;
                while(curr != null){
                        dummy.next = new Node(curr.val);
                        dummy = dummy.next;
                        cloneMap.put(i, dummy);
                        i++;
                        curr = curr.next;
                }

                Node clone = temp.next;
                dummy = clone;
                i = 0;
                while(dummy != null){
                        dummy.random = cloneMap.get(indexMap.get(i));
                        i++;
                        dummy = dummy.next;
                }

                return clone;
    }
}
