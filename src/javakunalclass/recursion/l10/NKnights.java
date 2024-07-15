package javakunalclass.recursion.l10;

public class NKnights {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        System.out.println(knights(board, 0, 0, 4));
    }

    private static int knights(boolean[][] board, int row, int col, int knights) {
        if (knights == 0) {
            display(board);
            System.out.println();
            return 1;
        }

        if (row == board.length - 1 && col == board.length) {
            return 0;
        }

        if (col == board.length) {
            return knights(board, row + 1, 0, knights);

        }
        int count = 0;
        if (isSafe(board, row, col)) {
            board[row][col] = true;
            count += knights(board, row, col + 1, knights - 1);
            board[row][col] = false;
        }
        count += knights(board, row, col + 1, knights);
        return count;
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        if (isValid(board, row - 2, col - 1)) {
            if (board[row - 2][col - 1]) {
                return false;
            }
        }
        if (isValid(board, row - 2, col + 1)) {
            if (board[row - 2][col + 1]) {
                return false;
            }
        }
        if (isValid(board, row - 1, col - 2)) {
            if (board[row - 1][col - 2]) {
                return false;
            }
        }
        if (isValid(board, row - 1, col + 2)) {
            if (board[row - 1][col + 2]) {
                return false;
            }
        }

        return true;
    }

    private static boolean isValid(boolean[][] board, int row, int col) {
        if (row >= 0 && row < board.length && col >= 0 && col < board.length) {
            return true;
        }
        return false;
    }


    public static void display(boolean[][] board) {
        for (boolean[] b : board) {
            for (boolean i : b) {
                if (i) System.out.print("K");
                else System.out.print("X");
            }
            System.out.println();
        }
    }
}
