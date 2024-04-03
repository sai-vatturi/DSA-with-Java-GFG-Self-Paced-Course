package javakunalclass.recursion_array;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 5, 6, 7, 8, 9, 10};
        int[] arr2 = {2, 4, 56, 6, 7,5,4, 7, 4};
        System.out.println(search(arr1, 0, 9));
        System.out.println(search(arr2, 0, 1));
        multipleIndexes(arr1, 0, 9);
    }
    static boolean search(int[] arr, int index, int target) {
        if (index == arr.length) {
            return false;
        }
        return (arr[index] == target) || search(arr, index + 1, target);
    }
    static void multipleIndexes(int[] arr, int index, int target) {
        if (index == arr.length) {
            return;
        }
        if (arr[index] == target) {
            System.out.println(index);
        }
        multipleIndexes(arr, index + 1, target);
    }
}
