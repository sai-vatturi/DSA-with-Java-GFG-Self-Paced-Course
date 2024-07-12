package javakunalclass.recursion.l2;

public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr ={5, 6, 7, 8, 9, 1, 2, 3};
        System.out.println(rotatedBS(arr, 44, 0, arr.length - 1));
    }

    private static int rotatedBS(int[] arr, int target, int s, int e) {
        if (s > e) {
            return -1;
        }
        int mid = s + (e - s) / 2;
        if (target == arr[mid]) {
            return mid;
        }
        if (arr[s] <= arr[mid]) {
            if (target >= arr[s] && target <= arr[mid]) {
                return rotatedBS(arr, target, s, mid - 1);
            }
            else {
                return rotatedBS(arr, target, mid + 1, e);

            }
        }

        if (target >= arr[mid] && target <= arr[e]) {
            return rotatedBS(arr, target, mid + 1, e);
        }
        else {
            return rotatedBS(arr, target, s, mid - 1);
        }
    }

}
