class Solution {
    public boolean validWordSquare(List<String> words) {
        int n = words.size();
        for(int i=0;i<words.size();i++){
            n = Math.max(words.get(i).length(), n);
        }
        char [][] board = new char [n][n];

        for(int i=0;i<n;i++){
            Arrays.fill(board[i], '1');
        }

        for(int i=0;i<words.size();i++){
            for(int j=0;j<words.get(i).length();j++){
                board[i][j] = words.get(i).charAt(j);
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(board[i][j] != board[j][i])return false;
            }
        }
        return true;
    }
}
