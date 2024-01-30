package javakunalclass.recursion;

public class BSRecursion {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,66,77};
        System.out.println(binaryRecursion(nums, 77, 0, nums.length - 1));
    }
    public static int binaryRecursion(int[] arr, int target, int s, int e) {
        if (s > e) {
            return -1;
        }
        int m = s + (e - s) / 2;
        if (arr[m] == target) {
            return m;
        }
        if (target < arr[m]) {
            return binaryRecursion(arr, target, s, m - 1);
        }
        return binaryRecursion(arr, target, m + 1, e);
    }
}
