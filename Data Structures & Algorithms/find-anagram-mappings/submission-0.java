class Solution {
    public int[] anagramMappings(int[] nums1, int[] nums2) {
        Map<Integer, Stack<Integer>> map = new HashMap<>();
        int i = 0;
        for(int n : nums2){
            if(map.containsKey(n)){
                Stack<Integer> st = map.get(n);
                st.add(i);
                map.put(n, st);
            }else{
                Stack st = new Stack<>();
                st.add(i);
                map.put(n, st);
            }
            i++;
        }

        int [] res = new int [nums1.length];

        for(int j=0;j<nums1.length;j++){
            res[j] = map.get(nums1[j]).pop();
        }
        return res;
    }
}
