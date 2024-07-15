package javakunalclass.recursion.l9;

public class MazePathsBacktracking {
    public static void main(String[] args) {
        boolean[][] maze = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };
        mazePathsBacktracking("", maze, 0, 0);
    }

    private static void mazePathsBacktracking(String s, boolean[][] maze, int row, int col) {
        if (row == maze.length - 1 && col == maze[0].length - 1) {
            System.out.println(s);
            return;
        }
        if (!maze[row][col]) {
            return;
        }

        maze[row][col] = false;

        if (row < maze.length - 1) {
            mazePathsBacktracking(s + "D", maze, row + 1, col);
        }
        if (col < maze[0].length - 1) {
            mazePathsBacktracking(s + "R", maze, row , col + 1);
        }
        if (row > 0) {
            mazePathsBacktracking(s + "U", maze, row -1, col);
        }
        if (col > 0) {
            mazePathsBacktracking(s + "L", maze, row, col - 1);
        }
        maze[row][col] = true;
    }
}
