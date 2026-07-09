class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        Map<Integer, Integer> map = new HashMap<>();
        int n = grid.length;
        for(int i=1;i<=n*n; i++){
            map.put(i, 0);
        }
        
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                map.put(grid[i][j], map.getOrDefault(grid[i][j], 0) + 1);
            }
        }
        int [] res = new int [2];
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() == 0){
                res[1] = entry.getKey();
            }else if(entry.getValue() == 2){
                res[0] = entry.getKey();
            }
        }
        return res;
    }
}