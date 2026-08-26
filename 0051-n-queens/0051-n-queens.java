class Solution {
    public static void nQueens(char board[][], int row,List<List<String>> xstring) {
        int n=board.length;
        if (row == board.length) {
              List<String> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < n; j++) {
                    sb.append(board[i][j]);
                }
                list.add(sb.toString());
            } 
             xstring.add(list);
            return ;
        }
        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q';
                nQueens(board,row+1,xstring);
                board[row][j] = '.';
            }
        }
        
    }

    public static boolean isSafe(char board[][], int row, int col) {
        // vertical up direction
        
        for (int i = row; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }
        // diagonal1
        int j=col;
        for (int i = row ; i >= 0 && j >= 0; i--) {
            if (board[i][j] == 'Q') {
                return false;
            }
            j--;
        }
        // diagonal2
        int k = col;
        for (int i = row; i >= 0 && k < board.length; i--) {
            if (board[i][k] == 'Q') {
                return false;
            }
            k++;
        }
        return true;
    }

    public List<List<String>> solveNQueens(int n) {
        char board[][] = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }
        List<List<String>> xstring = new ArrayList<>();
        nQueens(board,0,xstring);
             return xstring;
    }
}