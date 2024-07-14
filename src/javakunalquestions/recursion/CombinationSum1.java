package javakunalquestions.recursion;

import javakunalclass.oops.access.A;

import java.util.ArrayList;

public class CombinationSum1 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 6, 7};
        int target = 7;
        combinationSum1(new ArrayList<>(), arr, 0, 0, target);
    }

    public static void combinationSum1(ArrayList<Integer> list, int[] arr, int currentIndex, int currentSum, int target) {
        if (currentSum > target) {
            return;
        }
        if (currentSum == target) {
            System.out.println(list);
        }
        for (int i = currentIndex; i < arr.length; i++) {
            list.add(arr[i]);
            combinationSum1(list, arr, i, currentSum + arr[i], target);
            list.remove(list.size() - 1); // Backtrack
        }
    }
}
