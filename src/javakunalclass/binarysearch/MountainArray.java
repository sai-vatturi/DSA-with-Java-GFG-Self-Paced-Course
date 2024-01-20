package javakunalclass.binarysearch;

public class MountainArray {
    static int highestElementArray (int[] arr) {
        int n = arr.length;
        int start = 0;
        int end = n - 1;
        while (start<=end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid+1]) { // Decreasing Part of the Array
                return arr[mid-1];
            } else if (arr[mid] < arr[mid+1]){ // Increasing Part of the Array
                start = mid + 1;
            }
        }
        return start;
    }

    public static void main(String[] args) { 
        int[] nums = {0,1,2,4,5,8,9,8,5,1};
        System.out.println(highestElementArray(nums));
    }
}
