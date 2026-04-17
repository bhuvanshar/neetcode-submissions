class MyHashMap {
Map<Integer, Integer>map;
    public MyHashMap() {
        this.map = new HashMap<>();
    }
    
    public void put(int key, int value) {
        this.map.put(key,value);
    }
    
    public int get(int key) {
        if(map.containsKey(key))
        return this.map.get(key).intValue();
        else return -1;
    }
    
    public void remove(int key) {
        this.map.remove(key);
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */