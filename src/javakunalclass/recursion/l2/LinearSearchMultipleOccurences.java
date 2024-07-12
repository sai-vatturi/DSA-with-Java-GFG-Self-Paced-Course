package javakunalclass.recursion.l2;

import java.util.ArrayList;

public class LinearSearchMultipleOccurences {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 4, 4, 18, 9};
        System.out.println(linearSearchMultipleOccurences(arr, 0, 4));
    }

    private static ArrayList<Integer> linearSearchMultipleOccurences(int[] arr, int i, int target) {
        ArrayList<Integer> list = new ArrayList<>();
        if (i == arr.length) return list;
        if (arr[i] == target) list.add(i);
        ArrayList<Integer> listFromBelowCalls = linearSearchMultipleOccurences(arr, i + 1, target);
        list.addAll(listFromBelowCalls);
        return list;
    }
}
