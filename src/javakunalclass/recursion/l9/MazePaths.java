package javakunalclass.recursion.l9;

public class MazePaths {
    public static void main(String[] args) {
        System.out.println(ratInAMaze(3, 3));
    }

    private static int ratInAMaze(int row, int col) {
        if (row == 1 || col == 1) {
            return  1;
        }
        return ratInAMaze(row - 1, col) + ratInAMaze(row, col - 1);
    }
}
