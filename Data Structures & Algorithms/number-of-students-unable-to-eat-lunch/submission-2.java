class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> sq = new LinkedList<>();
        Queue<Integer> saq = new LinkedList<>();

        for(int i : students){
            sq.add(i);
        }
        for(int i : sandwiches){
            saq.add(i);
        }

        int n = students.length;
        int x = 0;
        while(!sq.isEmpty()){
            int want = sq.poll();
            int have = saq.peek();

            if(want == have){
                saq.poll();
                x = 0;
            }else{
                sq.add(want);
                x++;
                if(x == sq.size())break;
            }
        }
        return sq.size();
    }
}