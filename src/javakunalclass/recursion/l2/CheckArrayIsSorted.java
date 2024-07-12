package javakunalclass.recursion.l2;

public class CheckArrayIsSorted {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5};
        System.out.println(checkSorted(arr, 0));
        System.out.println(checkSortedBack(arr, arr.length - 1));
    }

    private static boolean checkSorted(int[] arr, int i) {
        if (i == arr.length - 1) return true;
        return arr[i] < arr[i + 1] && checkSorted(arr, i + 1);
    }

    private static boolean checkSortedBack(int[] arr, int i) {
        if (i == 0) return true;
        return arr[i] > arr[i - 1] && checkSortedBack(arr, i - 1);
    }
}
