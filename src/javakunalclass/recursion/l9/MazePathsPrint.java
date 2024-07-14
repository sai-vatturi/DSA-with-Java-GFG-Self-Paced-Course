package javakunalclass.recursion.l9;

public class MazePathsPrint {
    public static void main(String[] args) {
        printPath("", 3, 3);
    }

    public static void printPath(String p, int row, int col) {
        if (row == 1 && col == 1) {
            System.out.println(p);
            return;
        }
        if (row > 1) printPath(p + "D", row - 1, col);
        if (col > 1) printPath(p + "R", row, col - 1);
    }
}
