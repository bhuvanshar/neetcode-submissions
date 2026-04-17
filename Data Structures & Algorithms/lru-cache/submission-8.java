class Node {
        int val;
        Node prev;
        Node next;
        int key;

        public Node(int key, int val){
            this.key = key;
            this.val = val;
        }
    }

class LRUCache {
     int capacity;
     Node right;
     Node left;
     Map<Integer, Node> cache;

    

    public LRUCache(int capacity) {

    //  public LRUCache(int cap){
        this.capacity = capacity;
        this.right = new Node(0,0);
        this.left = new Node(0,0);
        this.right.prev = this.left;
        this.left.next = this.right;
        this.cache = new HashMap<>();
    //  }

    }

     public void insert(Node node){
        Node prev = this.right.prev;
        prev.next = node;
        node.prev = prev;
        node.next = this.right;
        this.right.prev = node;
     }

     public void remove(Node node){
        // Node node = cache.get(key);
        Node prev = node.prev;
        Node nxt = node.next;
        prev.next = nxt;
        nxt.prev = prev;
     }
    
    public int get(int key) {
        if(cache.containsKey(key)){
            Node node = cache.get(key);
            remove(cache.get(key));
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
            Node lru  = this.left.next;
            remove(lru);
            cache.remove(lru.key);
        }

    }
}
