package javakunalclass.recursion.l9;

import javakunalclass.oops.access.A;

import java.util.ArrayList;

public class MazePathsDiagonal {
    public static void main(String[] args) {
        ArrayList<String> res = mazePathsDiagonal("", 3, 3);
        System.out.println(res);
    }

    private static ArrayList<String> mazePathsDiagonal(String s, int row, int col) {
        if (row == 1 && col == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(s);
            return list;
        }
        ArrayList<String> res = new ArrayList<>();
        if (row > 1 && col > 1) {
            res.addAll(mazePathsDiagonal(s + "X", row - 1, col - 1));
        }
        if (row > 1) {
            res.addAll(mazePathsDiagonal(s + "D", row - 1, col));
        }
        if (col > 1) {
            res.addAll(mazePathsDiagonal(s + "R", row, col - 1));
        }
        return res;
    }
}
