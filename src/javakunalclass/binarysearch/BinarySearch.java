package javakunalclass.binarysearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-12, -11, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr2 = {9,7,4,2,1,-2};
        System.out.println(binarySearch(arr, 5));
        System.out.println(binarySearchDescendingOrder(arr2, -2));

    }
    // return the index
    // return - 1 if not found
    public static int binarySearch(int[] nums, int target){
        int start = 0;
        int end = nums.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if (target < nums[mid]){
                end = mid - 1;
            } else if(target > nums[mid]){
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
    public static int binarySearchDescendingOrder(int[] nums, int target){
        int start = 0;
        int end = nums.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if (target < nums[mid]){
                start = mid + 1;
            } else if(target > nums[mid]){
                end = mid - 1;

            } else {
                return mid;
            }
        }
        return -1;
    }
}
