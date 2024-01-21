package javakunalclass.binarysearch;
public class SelectInMountain {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 4, 2, 1, 0};
        System.out.println(selectElementArray(nums, 0));
    }

    private static int selectElementArray(int[] nums, int target) {
        // find largest
        int peak = highestElementArray(nums);
        // Search in 1st half or else 2nd half
        int firstTry = orderAgnosticBS(nums, target, 0, peak);
        if (firstTry != -1) {
            return firstTry;
        }
        return orderAgnosticBS(nums, target, peak + 1, nums.length - 1);
    }

    static int highestElementArray(int[] arr) {
        int n = arr.length;
        int start = 0;
        int end = n - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) { // Decreasing Part of the Array
                end = mid;  // Corrected line
            } else { // Increasing Part of the Array
                start = mid + 1;
            }
        }
        return start; // Changed from 'end' to 'start'
    }

    public static int orderAgnosticBS(int[] nums, int target, int start, int end) {
        boolean isAsc = nums[start] <= nums[end];
        ;
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
