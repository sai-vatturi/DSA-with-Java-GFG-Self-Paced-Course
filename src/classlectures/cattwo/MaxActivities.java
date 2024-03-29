package classlectures.cattwo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class MaxActivities {
    public static void main(String[] args) {
        int n =2;
        int[][] arr = new int[n][n];
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        list.add(new ArrayList<Integer>());
        list.get(0).add(2);
        list.get(0).add(5);
        list.get(0).add(6);
        list.add(new ArrayList<Integer>());
        list.get(1).add(2);
        for (ArrayList lis : list) {
            System.out.println(lis.reversed());
        }
        int s[] = {1, 3, 0, 5, 8, 5};
        int f[] = {2, 4, 6, 7, 9, 9};

//        printMaxActivities(s, f, n);
    }

    private static void printMaxActivities(int[] start, int[] end, int n) {
        int i, j;

        System.out.println("Following Activities are Selected: ");
        i = 0;
        System.out.print(i + " ");

        for (j = 1; j < n; j++) {
            if (start[j] >= end[i]) {
                System.out.print(j + " ");
                i = j;
            }
        }
    }
}
