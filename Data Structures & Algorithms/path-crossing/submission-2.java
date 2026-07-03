class Solution {
    public boolean isPathCrossing(String path) {
        Set<String>set = new HashSet<>();
        Map<Character, Integer> map = new HashMap<>();
        map.put('N', 1);
        map.put('S', -1);
        map.put('E', 1);
        map.put('W', -1);
        int x = 0;
        int y = 0;
        String origin = "0,0";
        set.add(origin);
        for(int i=0;i<path.length();i++){
            if(path.charAt(i) == 'E' || path.charAt(i) == 'W'){
                x = x+map.get(path.charAt(i));
                String key = x + "," + y;
                if(!set.contains(key)){
                    set.add(key);
                }else{
                    return true;
                }
            }else{
                y = y+map.get(path.charAt(i));
                String key = x + "," + y;
                
                if(!set.contains(key)){
                    set.add(key);
                }else{
                    return true;
                }
            }
        }
        return false;
    }
}