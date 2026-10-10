class LRUCache {
    Node left;
    Node right;
    int capacity;
    Map<Integer, Node> cache;

    class Node{
        int key;
        int val;
        Node prev;
        Node next;
        public Node(int key, int val){
            this.val = val;
            this.key = key;
        }
    }

    public LRUCache(int capacity) {
        this.cache = new HashMap<>();
        this.capacity = capacity;
        this.left = new Node(0,0);
        this.right = new Node(0,0);
        this.left.next = this.right;
        this.right.prev = this.left;
    }
    
    public void remove(Node node){
        Node prev = node.prev;
        Node next = node.next;
        prev.next = next;
        next.prev = prev;
    }

    public void insert(Node node){
        Node prev = this.right.prev;
        prev.next = node;
        node.next = this.right;
        this.right.prev = node;
        node.prev = prev;
    }

    public int get(int key) {
        if(cache.containsKey(key)){
            Node node = cache.get(key);
            remove(node);
            insert(node);
            return node.val;
        }
        return -1;
    }
    
    public void put(int key, int value) {
        if(cache.containsKey(key)){
            remove(cache.get(key));
        }

        Node newNode = new Node(key, value);
        insert(newNode);
        cache.put(key, newNode);

        if(cache.size() > capacity){
            Node lru = this.left.next;
            cache.remove(lru.key);
            remove(lru);
        }
    }
}
