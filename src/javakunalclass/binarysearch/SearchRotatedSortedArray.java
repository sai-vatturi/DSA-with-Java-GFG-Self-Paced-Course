package javakunalclass.binarysearch;

public class SearchRotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2}; // 0 1 2 4 5 6 7
        System.out.println(search(arr, 6));
    }
    static int search(int[] arr, int target){
        int pivot = findPivot(arr);
        if(pivot == -1){
            return binarySearch(arr, target, 0, arr.length-1);
        }
        if(arr[pivot] == target){
            return pivot;
        }
        if (target >= arr[0]){
            return binarySearch(arr, target, 0, pivot-1);
        }
        return binarySearch(arr, target, pivot + 1, arr.length-1);
    }
    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start<=end){
            int mid = start + (end - start) / 2;
            if(mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }
            if(mid > start && arr[mid] < arr[ mid-1]){
                return mid -1;
            }
            if(arr[mid] <= arr[start]) {
                end = mid - 1;
            } else{
                start = mid + 1;
            }
        }
        return -1;
    }
    public static int binarySearch(int[] nums, int target, int start, int end){
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
}
