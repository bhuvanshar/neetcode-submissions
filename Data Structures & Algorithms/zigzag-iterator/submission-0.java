class ZigzagIterator {
    int it = 0;
    List<Integer> res;
    public ZigzagIterator(List<Integer> v1, List<Integer> v2) {
        int p1 = 0;
        int p2 = 0;
        this.res = new ArrayList<>();
        while(p1 < v1.size() && p2 < v2.size()){
            res.add(v1.get(p1));
            res.add(v2.get(p2));
            p1++;
            p2++;
        }
        if(p1 < v1.size()){
            for(int i=p1; i<v1.size();i++){
                res.add(v1.get(i));
            }
        }else if(p2 < v2.size()){
            for(int i=p2; i<v2.size();i++){
                res.add(v2.get(i));
            }
        }
    }

    public int next() {
        int r = res.get(it);
        it++;
        return r;
    }

    public boolean hasNext() {
        return it < res.size();
    }
}

/**
 * Your ZigzagIterator object will be instantiated and called as such:
 * ZigzagIterator i = new ZigzagIterator(v1, v2);
 * while (i.hasNext()) v[f()] = i.next();
 */
