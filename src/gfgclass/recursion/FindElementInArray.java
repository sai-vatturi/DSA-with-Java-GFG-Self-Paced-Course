package gfgclass.recursion;

public class FindElementInArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(findArr(arr, 5, 0, 4));
    }
    static int findArr(int[] arr, int target, int left, int right) {
        if (right < left)  {
            return -1;
        }
        if (arr[left] == target) {
            return left;
        }
        if (arr[right] == target) {
            return right;
        }
        return findArr(arr, target, left + 1, right - 1);
    }
}
