class Solution {
    public int smallestCommonElement(int[][] mat) {
        Map<Integer, Set<Integer>>map = new HashMap<>();
        for(int i=0;i<mat.length;i++){
            int [] row = mat[i];
            Set<Integer> set = new HashSet<>();
            for(int n : row){
                set.add(n);
            }
            map.put(i, set);
        }
        int [] r = mat[0];
        int x = map.size();
        int m = 0;
        for(int i=0;i<r.length;i++){
            for(int j=0;j<map.size();j++){
                Set<Integer> mapSet = map.get(j);
                if(mapSet.contains(r[i])){
                    m++;
                    if(m == x)return r[i];
                    continue;
                }else{
                    m = 0;
                    break;
                }
            }
        }
        return -1;
    }
}
