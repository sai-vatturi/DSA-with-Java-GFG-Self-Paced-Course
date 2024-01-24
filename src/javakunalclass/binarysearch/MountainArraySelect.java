package javakunalclass.binarysearch;

public class MountainArraySelect {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 5, 6, 4, 2, 1, 0};
        System.out.println(getValue(nums, 4));
    }
    public static int getValue(int[] arr, int target) {
        // find peak
        // do order agnostic bs (first check ascending and then descending)
        int peak = getPeak(arr);
        int res = orderAgnosticBS(arr, target, 0, peak);
        if (res != -1) {
            return res;
        } else {
            return orderAgnosticBS(arr, target, peak, arr.length-1);
        }

    }
    public static int getPeak(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
    public static int orderAgnosticBS(int[] nums, int target, int start, int end) {
        boolean isAsc = nums[start] < nums[end];
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (isAsc) {
                if (target < nums[mid]) {
                    end = mid - 1;
                } else if (target > nums[mid]) {
                    start = mid + 1;
                } else {
                    return mid;
                }
            } else {
                if (target < nums[mid]) {
                    start = mid + 1;
                } else if (target > nums[mid]) {
                    end = mid - 1;
                } else {
                    return mid;
                }
            }
        }
        return -1;
    }

}
