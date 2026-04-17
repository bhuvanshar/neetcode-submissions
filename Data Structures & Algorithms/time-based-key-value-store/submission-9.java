class TimeMap {

    public class Pair{
        Integer key;
        String value;
        public Pair(Integer key, String value){
            this.key = key;
            this.value = value;
        }
        public Integer getKey(){
            return key;
        }

        public String getValue(){
            return value;
        }
    }

    Map<String, List<Pair>> timeMap;

    public TimeMap() {
        this.timeMap = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        if(timeMap.containsKey(key)){
            List<Pair> p = timeMap.get(key);
            p.add(new Pair(timestamp, value));
            timeMap.put(key, p);
        }else{
            List<Pair> arr = new ArrayList<>();
            arr.add(new Pair(timestamp, value));
            timeMap.put(key, arr);
        }
    }
    
    public String get(String key, int timestamp) {
        if(timeMap.containsKey(key)){
            List<Pair> p = timeMap.get(key);
            int l = 0;
            int r = p.size()-1;
            while(l <= r){
                int mid = l + (r-l)/2;
                if(p.get(mid).getKey() <= timestamp){
                    l = mid+1;
                }else{
                    r = mid-1;
                }
            }
            if(r < 0)return "";
            return p.get(r).getValue();

        }else{
            return "";
        }
    }
}
