package classlectures;
// Given an array of size n, generate and print all possible combinations of r elements in array.


import java.util.Arrays;
import java.util.Scanner;

public class Combinations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of the array: ");
        int n = sc.nextInt();

        // Initialize empty array
        int[] nums = new int[n];

        // Take input elements in the array
        System.out.println("Enter elements in the array with spaces: ");
        for (int i = 0;  i < n; i++) {
            nums[i] = sc.nextInt();
        }

        //print elements in original array
        System.out.println("Entered Array: ");
        System.out.print('[');
        for (int i = 0; i < n - 1; i++) {
            System.out.print(nums[i] + ", ");
        }
        System.out.println(nums[n - 1] + "]");

        // take r value input
        System.out.println("Enter r value: ");
        int r = sc.nextInt();

        // find and print all combinations
        generateCombinations(nums, r);
    }

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
                continue;
            }

            combination[currentIndex] = arr[i];
            generateCombinationsUtil(arr, combination, currentIndex + 1, i + 1);
        }
    }
}
