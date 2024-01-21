package javakunalclass.binarysearch;

public class MountainArray {
    static int highestElementArray (int[] arr) {
        int n = arr.length;
        int start = 0;
        int end = n - 1;
        while (start<end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid+1]) { // Decreasing Part of the Array
                end = mid ;
            } else{ // Increasing Part of the Array
                start = mid + 1;
            }
        }
        return end;
    }

    public static void main(String[] args) { 
        int[] nums = {1,2,3,4,5,4,2,1};
        System.out.println(highestElementArray(nums));
    }
}
