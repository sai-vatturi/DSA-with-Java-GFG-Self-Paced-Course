package javakunalclass.recursion_array;

public class FindSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 5, 6, 7, 8, 9, 10};
        int[] arr2 = {2, 4, 56, 6, 7,5,4, 7, 4};
        System.out.println(findSortedArray(arr1, 1, arr1.length));
        System.out.println(findSortedArray(arr2, 1, arr2.length));
        System.out.println(sorted(arr1, 0));
        System.out.println(sorted(arr2, 0));
    }

    static boolean findSortedArray(int[] arr, int i, int n) {
        if (i == n) {
            return true;
        }
        if (arr[i] < arr[i - 1]) {
            return false;
        }
        return findSortedArray(arr, i + 1, n);
    }

    static boolean sorted(int[] arr, int i) {
        if (i == arr.length - 1) {
            return true;
        }
        return arr[i] <= arr[i + 1] && sorted(arr, i + 1);
    }
}
