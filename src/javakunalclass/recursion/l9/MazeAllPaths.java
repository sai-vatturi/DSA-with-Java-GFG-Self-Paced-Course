package javakunalclass.recursion.l9;


public class MazeAllPaths {
    public static void main(String[] args) {
        boolean[][] maze = {
                {true, true, true},
                {true, true, true},
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
            maze[row][col] = true;

        }
        if (col < maze[0].length - 1) {
            ratPathsRestrictions(s + "R", maze, row, col + 1);
            maze[row][col] = true;

        }
        if (row > 0) {
            maze[row][col] = false;
            ratPathsRestrictions(s + "U", maze, row - 1, col);
        }
        if (col > 0) {
            maze[row][col] = false;
            ratPathsRestrictions(s + "L", maze, row, col - 1);
        }
    }
}
