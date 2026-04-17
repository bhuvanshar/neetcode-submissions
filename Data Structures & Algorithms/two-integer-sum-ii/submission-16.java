class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<numbers.length;i++){
            map.put(numbers[i], i);
        }

    int [] res = new int [2];
        for(int i=0;i<numbers.length;i++){
            int tar = target-numbers[i];
            if(map.containsKey(tar) && map.get(tar) != i){
                res[0] = (map.get(tar) < i ? map.get(tar)+1 : i+1);
                res[1] = (map.get(tar) > i ? map.get(tar)+1 : i+1);
            }
        }
        return res;
    }
}
