package javakunalclass.recursion.l2;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 18, 9};
        System.out.println(linearSearch(arr, 6, 0));
    }
    private static int linearSearch(int[] arr, int target, int i) {
        if (i == arr.length) return -1;
        if (arr[i] == target) {
            return i;
        }
        return linearSearch(arr, target, i + 1);
    }
}
