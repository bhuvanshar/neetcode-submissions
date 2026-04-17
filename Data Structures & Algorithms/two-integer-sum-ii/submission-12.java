class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer>map = new HashMap<>();
        for(int i=0;i<numbers.length;i++){
            map.put(numbers[i], i);
        }
        int [] res = new int [2];
        for(int i=0;i<numbers.length;i++){
            int newTarget = target-numbers[i];
            if(map.containsKey(newTarget)){
                if(i < map.get(newTarget)){
                    res[0] = i+1;
                    res[1] = map.get(newTarget)+1;
                }else{
                    res[1] = i+1;
                    res[0] = map.get(newTarget)+1;
                }
            }
        }
        return res;
    }
}
