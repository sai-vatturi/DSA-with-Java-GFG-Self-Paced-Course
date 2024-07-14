package javakunalclass.recursion.l9;

public class MazePathsRestrictions {
    public static void main(String[] args) {
        boolean[][] maze = {
                {true, true, true},
                {true, false, true},
                {true, true, true}
        };
        ratPathsRestrictions("", maze, 0, 0);
    }

    private static void ratPathsRestrictions(String s, boolean[][] maze, int row, int col) {
        if (row == maze.length - 1 && col == maze[0].length - 1) {
            System.out.println(s);
            return;
        }

        if (!maze[row][col]) return;

        if (row < maze.length - 1) {
            ratPathsRestrictions(s + "D", maze, row + 1, col);
        }
        if (col < maze[0].length - 1) {
            ratPathsRestrictions(s + "R", maze, row, col + 1);
        }
    }
}
