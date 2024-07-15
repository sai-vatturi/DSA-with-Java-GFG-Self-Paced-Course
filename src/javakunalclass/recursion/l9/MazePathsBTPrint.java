package javakunalclass.recursion.l9;

import java.util.ArrayList;
import java.util.Arrays;

public class MazePathsBTPrint { public static void main(String[] args) {
    boolean[][] maze = {
            {true, true, true},
            {true, true, true},
            {true, true, true}
    };
    int[][] path = new int[maze.length][maze[0].length];
    mazePathsBacktracking("", maze, 0, 0, path, 1);
}

    private static void mazePathsBacktracking(String s, boolean[][] maze, int row, int col, int[][] path, int step) {
        if (row == maze.length - 1 && col == maze[0].length - 1) {
            path[row][col] = step;
            for (int[] i : path) {
                System.out.println(Arrays.toString(i));
            }
            System.out.println(s);
            System.out.println();
            return;
        }
        if (!maze[row][col]) {
            return;
        }

        maze[row][col] = false;
        path[row][col] = step;
        if (row < maze.length - 1) {
            mazePathsBacktracking(s + "D", maze, row + 1, col, path, step + 1);
        }
        if (col < maze[0].length - 1) {
            mazePathsBacktracking(s + "R", maze, row , col + 1, path, step + 1);
        }
        if (row > 0) {
            mazePathsBacktracking(s + "U", maze, row -1, col, path, step + 1);
        }
        if (col > 0) {
            mazePathsBacktracking(s + "L", maze, row, col - 1, path, step + 1);
        }
        maze[row][col] = true;
        path[row][col] = 0;
    }
}
