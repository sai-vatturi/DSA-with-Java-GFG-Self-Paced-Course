package javakunalclass.recursion_array;

public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr1 = {3, 1};
        System.out.println(rotatedBinarySearch(arr1, 1, 0, arr1.length));
    }

    private static int rotatedBinarySearch(int[] arr, int target, int start, int end) {
        if (start > end) {
            return -1;
        }
        int mid = start + (end - start) / 2;
        if (arr[mid] == target) {
            return mid;
        }
        if (arr[start] < arr[mid]) {
            if (arr[start] <= target && arr[mid] >= target) {
                return rotatedBinarySearch(arr, target, start, mid - 1);
            } else {
                return rotatedBinarySearch(arr, target, mid + 1, end);
            }
        }
        if (target >= arr[mid] && target <= arr[end]) {
            return rotatedBinarySearch(arr, target, mid + 1, end);
        } else {
            return rotatedBinarySearch(arr, target, start, mid - 1);
        }
    }
}


//User function Template for Java

//class Solution
//{
//    int search(int A[], int l, int h, int key)
//    {
//        // l: The starting index
//        // h: The ending index, you have to search the key in this range
//        // Complete this function
//        int low = l;
//        int high = h;
//        while (low <= high) {
//            int mid = (low + high) / 2;
//            if (key == A[mid]) {
//                return mid;
//            } else if (A[low] <= A[mid]) {
//                if (key >= A[low] && key <= A[mid]) {
//                    high = mid - 1;
//                } else {
//                    low = mid + 1;
//                }
//            } else {
//                if (key <= A[high] && key >= A[mid]) {
//                    low = mid + 1;
//                }
//                else {
//                    high = mid - 1;
//                }
//            }
//        }
//        return -1;
//    }
//}