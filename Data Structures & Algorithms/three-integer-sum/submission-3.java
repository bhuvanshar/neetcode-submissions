class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int [] num = nums;
            List<List<Integer>> result = new ArrayList<>();
            Arrays.sort(num);
            for(int j=0;j<num.length;j++){
                int i =j+1;
                int k = num.length-1;
                while(i < k){
                    if(num[i] + num[k] + num[j] < 0){
                        i++;
                    }else if(num[i] + num[k] + num[j] > 0){
                        k--;
                    }else{
                        result.add(Arrays.asList(num[j], num[i], num[k]));
                        i++;k--;
                    }
                }
            }
            
            HashSet<List<Integer>> set = new HashSet<>();
            for(List<Integer> X : result){
                set.add(X);
            }
            return set.stream().collect(Collectors.toList());
    }
}
