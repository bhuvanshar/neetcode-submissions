class TimeMap {
    public static class Pair{
        public int time;
        public String mood;
        public Pair(int time, String mood){
            this.time = time;
            this.mood = mood;
        }
    }

    Map<String, List<Pair>>map;
    public TimeMap() {
        this.map = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        if(map.containsKey(key)){
            Pair p = new Pair(timestamp, value);
            List<Pair> prevPair = map.get(key);
            prevPair.add(p);
            map.put(key, prevPair);
        }else{
            List<Pair> p = new ArrayList<>();
            p.add(new Pair(timestamp, value));
            map.put(key, p);
        }
    }
    
    public String get(String key, int timestamp) {
        if(map.containsKey(key)){
            List<Pair> list = map.get(key);
            int l = 0;
            int r = list.size()-1;
            while(l <= r){
                int mid = l + (r-l)/2;
                if(list.get(mid).time < timestamp){
                    l = mid+1;
                }else if(list.get(mid).time > timestamp){
                    r = mid-1;
                }else{
                    return list.get(mid).mood;
                }
            }
            if(r>=0)
            return list.get(r).mood;
            else return "";
        }else{
            return "";
        }
        // return "";
    }
}
