class Solution {
    public static boolean isSafe(char[][]sudoku,int row,int col,char i){
          // checking if row is safe
        for (int j = 0; j < 9; j++) {
            if (sudoku[j][col] == i) {
                return false;
            }
        }
        // checking column
        for (int j = 0; j < 9; j++) {
            if (sudoku[row][j] == i) {
                return false;
            }
        }
        // checking grid
        int st = (row / 3) * 3;
        int st2 = (col / 3) * 3;
        for (int j = st; j < st + 3; j++) {
            for (int k = st2; k < st2 + 3; k++) {
                if (sudoku[j][k] == i) {
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean solve(char[][]sudoku,int row,int col){
        if(row==9){
            return true;
        }
        int nextRow=row;
        int nextCol=col+1;
        if(nextCol==9){
            nextCol=0;
            nextRow++;
        }
        if(sudoku[row][col]!='.'){
            return solve(sudoku,nextRow,nextCol);
        }
        for(int i=1;i<=9;i++){
            if(isSafe(sudoku,row,col,(char)(i+'0'))){
                sudoku[row][col]=(char)(i+'0');
                if(solve(sudoku,nextRow,nextCol)){
                    return true;
                }
                sudoku[row][col]='.';
            }
        }
        return false;
    }
    public void solveSudoku(char[][] sudoku) {
        solve(sudoku,0,0);
    }
}