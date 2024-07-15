package javakunalclass.recursion.l10;

import java.util.Arrays;

public class SudokuSolver {
    public static void main(String[] args) {
        String[][] board =
                {{"5","3",".",".","7",".",".",".","."},
                        {"6",".",".","1","9","5",".",".","."},
                        {".","9","8",".",".",".",".","6","."},
                        {"8",".",".",".","6",".",".",".","3"},
                        {"4",".",".","8",".","3",".",".","1"},
                        {"7",".",".",".","2",".",".",".","6"},
                        {".","6",".",".",".",".","2","8","."},
                        {".",".",".","4","1","9",".",".","5"},
                        {".",".",".",".","8",".",".","7","9"}};
        if (sudokuSolver(board)) {
            for (String[] row : board) {
                System.out.println(Arrays.toString(row));
            }
        } else {
            System.out.println("No solution exists");
        }
    }

    private static boolean sudokuSolver(String[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j].equals(".")) {
                    for (int k = 1; k <= 9; k++) {
                        if (isSafe(board, i, j, k)) {
                            board[i][j] = String.valueOf(k);
                            if (sudokuSolver(board)) {
                                return true;
                            } else {
                                board[i][j] = ".";
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean isSafe(String[][] board, int row, int col, int k) {
        // check vertical and horizontal
        for (int i = 0; i < board.length; i++) {
            if (board[row][i].equals(String.valueOf(k)) || board[i][col].equals(String.valueOf(k))) {
                return false;
            }
        }

        // Check box
        int boxStartRow = row - row % 3;
        int boxStartCol = col - col % 3;
        for (int i = boxStartRow; i < boxStartRow + 3; i++) {
            for (int j = boxStartCol; j < boxStartCol + 3; j++) {
                if (board[i][j].equals(String.valueOf(k))) {
                    return false;
                }
            }
        }
        return true;
    }
}