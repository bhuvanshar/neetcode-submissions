class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> dict = new HashSet<>(wordList);
        if(!dict.contains(endWord)) return 0;

        int steps = 1;
        Set<String> visited = new HashSet<>();
        Queue<String> queue = new ArrayDeque<>();

        visited.add(beginWord);
        queue.add(beginWord);

        while(!queue.isEmpty()){
            int size = queue.size();
            
            for(int i=0;i<size;i++){
                String word = queue.poll();
                char[] chars = word.toCharArray();
                if(word.equals(endWord))return steps;
                for(int j=0;j<chars.length;j++){
                    char original = chars[j];
                    for(char c = 'a'; c <= 'z'; c++){
                        if(c == original)continue;
                        chars[j] = c;
                        String next = new String(chars);
                        if(dict.contains(next)&&!visited.contains(next)){
                            queue.add(next);
                            visited.add(next);
                        }
                    }
                    chars[j] = original;
                }
            }
            steps++;
        }
        return 0;
    }
}
