class Solution {
    public boolean isValidSudoku(char[][] board) {
        Map<Integer, Set<Character>> rows = new HashMap<>();
        Map<Integer, Set<Character>> cols = new HashMap<>();
        Map<String, Set<Character>> squareSet = new HashMap<>();

        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length; j++){
                if(board[i][j] == '.')continue;
                String squareKey = (i/3) + "," + (j/3);
                if(
                rows.computeIfAbsent(i, k->new HashSet<>()).contains(board[i][j]) || 
                cols.computeIfAbsent(j, k->new HashSet<>()).contains(board[i][j]) || 
                squareSet.computeIfAbsent(squareKey, k->new HashSet<>()).contains(board[i][j])){
                    return false;
                }

                rows.get(i).add(board[i][j]);
                cols.get(j).add(board[i][j]);
                squareSet.get(squareKey).add(board[i][j]);
            }
        }
        return true;
    }
}
