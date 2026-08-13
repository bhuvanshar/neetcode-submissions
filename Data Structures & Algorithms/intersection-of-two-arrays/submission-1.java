class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        List<Integer> res = new ArrayList<>();

        for(int i : nums1){
            set1.add(i);
        }
        for(int j : nums2){
            set2.add(j);
        }

        boolean one = false;
        boolean two = false;
        if(set1.size() >= set2.size()){
            one = true;
        }else{
            two = true;
        }

        if(one){
            for(int n : set1){
                if(set2.contains(n)){
                    res.add(n);
                }
            }
        }else{
            for(int n : set2){
                if(set1.contains(n)){
                    res.add(n);
                }
            }
        }
        return res.stream().mapToInt(Integer::intValue).toArray();
    }
}