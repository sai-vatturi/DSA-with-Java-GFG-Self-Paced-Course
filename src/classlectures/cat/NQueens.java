package classlectures.cat;
public class NQueens {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        if (!queens(board, 0)) {
            System.out.println("No solution found.");
        }
    }

    static boolean queens(boolean[][] board, int row) {
        if (row == board.length) {
            display(board);
            System.out.println();
            return true;  // Terminate recursion after finding the first solution
        }

        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = true;
                if (queens(board, row + 1)) {
                    return true;  // Terminate recursion if a solution is found
                }
                board[row][col] = false; // back track
            }
        }
        return false;
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        // Check vertical row
        for (int i = 0; i < row; i++) {
            if (board[i][col]) {
                return false;
            }
        }
        // Check diagonals
        int maxLeft = Math.min(row, col);
        for (int i = 1; i <= maxLeft; i++) {
            if (board[row - i][col - i]) {
                return false;
            }
        }
        int maxRight = Math.min(row, board.length - col - 1);
        for (int i = 1; i <= maxRight; i++) {
            if (board[row - i][col + i]) {
                return false;
            }
        }
        return true;
    }

    private static void display(boolean[][] board) {
        for (boolean[] row : board) {
            for (boolean element : row) {
                if (element) {
                    System.out.print("Q ");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
}
