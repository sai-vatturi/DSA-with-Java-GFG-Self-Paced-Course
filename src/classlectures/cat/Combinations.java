package classlectures.cat;

import java.util.Arrays;

public class Combinations {
    public static void generateCombinations(int[] arr, int r) {
        int[] combination = new int[r];
        generateCombinationsUtil(arr, combination, 0, 0);
    }

    private static void generateCombinationsUtil(int[] arr, int[] combination, int currentIndex, int start) {
        if (currentIndex == combination.length) {
            System.out.println(Arrays.toString(combination));
            return;
        }

        for (int i = start; i < arr.length; i++) {
            if (i > start && arr[i] == arr[i - 1]) {
                continue; // Skip duplicates
            }
            combination[currentIndex] = arr[i];
            generateCombinationsUtil(arr, combination, currentIndex + 1, i + 1);
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 6};
        int r = 3;
        Arrays.sort(arr); // Sort the array to handle duplicates
        generateCombinations(arr, r);
    }
}
