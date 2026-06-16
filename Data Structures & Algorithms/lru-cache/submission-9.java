public class Node{
    int key;
    int val;
    Node next;
    Node prev;
    public Node(int key, int val){
        this.key = key;
        this.val = val;
    }
}
class LRUCache {
    int capacity;
    Map<Integer, Node> cache = new HashMap<>();
    Node left;
    Node right;
    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.left = new Node(0,0);
        this.right = new Node(0,0);
        this.cache = new HashMap<>();
        this.left.next = this.right;
        this.right.prev = this.left;
    }

    public void insert(Node node){
        Node prev = this.right.prev;
        prev.next = node;
        node.next= this.right;
        node.prev = prev;
        this.right.prev = node;
    }
    public void remove(Node node){
        Node prev = node.prev;
        Node nxt = node.next;
        prev.next = nxt;
        nxt.prev = prev;
    }

    public int get(int key) {
        if(cache.containsKey(key)){
            Node node = cache.get(key);
            remove(node);
            insert(node);
            return cache.get(key).val;
        }
        return -1;
    }
    
    public void put(int key, int value) {
        if(cache.containsKey(key)){
            remove(cache.get(key));
        }
        Node newNode = new Node(key, value);
        cache.put(key, newNode);
        insert(newNode);

        if(cache.size() > capacity){
            Node lru = this.left.next;
            remove(lru);
            cache.remove(lru.key);
        }
    }
}
