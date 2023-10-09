// link to problem: https://leetcode.com/problems/valid-sudoku/
class Sudoku {
    public boolean isValidSudoku(char[][] board) {
        for (int r=0;r<9;r++) {
            for (int c=0;c<9;c++) {
                if (board[r][c] != '.') {
                    for (int c1=0;c1<9;c1++) {
                        if (c!=c1 && board[r][c] == board [r][c1] )
                            return false; // checking for same number in same row
                    } 
                    for (int r1=0;r1<9;r1++) {
                        if (r!=r1 && board[r][c] == board [r1][c] )
                            return false; // checking for same number in same column
                    } 
                }
            }
        } 
        for (int r=0;r<9;r=r+3) {
            for (int c=0;c<9;c=c+3) {
                for (int r1=r;r1<r+3;r1++) {
                    for (int c1=c;c1<c+3;c1++) {
                        if (board[r1][c1] != '.') {
                            for (int r2=r;r2<r+3;r2++) {
                                for (int c2=c;c2<c+3;c2++) {
                                    if((r1 != r2 || c1 != c2) && board[r1][c1] == board [r2][c2] )
                                        return false; //checking for same number within 3x3 box
                                }
                            } 
                        }
                    }
                }  
            }
        }
        return true;  
    }
}