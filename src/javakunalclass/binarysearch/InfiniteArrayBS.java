package javakunalclass.binarysearch;

public class InfiniteArrayBS {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,4,5,6,7,8,9,10,123};
        System.out.println(findingRange(arr, 2));
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
    public static int findingRange(int arr[], int target){
        // find the range
        int start = 0;
        int end = 1;
        // condition for the target to lie in the range
        while(target > arr[end]){
            int temp = end + 1;
            end = end + (end - start + 1) * 2;
            start = temp;
        }
        return binarySearch(arr, target, start, end);
    }
}
