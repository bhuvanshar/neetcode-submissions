class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
        int res = 0;
        int n = arrays.get(0).size();
        int max_val = arrays.get(0).get(arrays.get(0).size()-1);
        int min_val = arrays.get(0).get(0);

        for(int i=1;i<arrays.size();i++){
            res = Math.max(res, Math.max(Math.abs(max_val - arrays.get(i).get(0)), Math.abs(arrays.get(i).get(arrays.get(i).size()-1) - min_val)));
            max_val = Math.max(max_val, arrays.get(i).get(arrays.get(i).size()-1));
            min_val = Math.min(min_val, arrays.get(i).get(0));
        }
        return res;
    }
}
