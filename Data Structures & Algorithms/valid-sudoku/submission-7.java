class Solution {
    public boolean isValidSudoku(char[][] board) {
        Map<Integer, HashSet<Character>>rows = new HashMap<>();
        Map<Integer, HashSet<Character>>cols = new HashMap<>();
        Map<String, HashSet<Character>>squareSet = new HashMap<>();

        for(int r=0;r<board.length;r++){
            for(int c = 0; c<board.length;c++){
                if(board[r][c] == '.')continue;

                String squareKey = (r/3) + "," + (c/3);

                if(rows.computeIfAbsent(r,k->new HashSet<>()).contains(board[r][c]) || 
                    cols.computeIfAbsent(c, k->new HashSet<>()).contains(board[r][c]) ||
                    squareSet.computeIfAbsent(squareKey,k->new HashSet<>()).contains(board[r][c])){
                        return false;
                    }
                    rows.get(r).add(board[r][c]);
                    cols.get(c).add(board[r][c]);
                    squareSet.get(squareKey).add(board[r][c]);
            }
        }
        return true;
    }
}
