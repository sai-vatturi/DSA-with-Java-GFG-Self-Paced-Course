package javakunalclass.binarysearch;

public class FloorBS {
    public static void main(String[] args) {
        int[] arr = {-12, -11, 0, 1, 2, 3, 4, 8, 9, 10};
        System.out.println(floorOfANumber(arr, 5));

    }
    // return the index
    // return - 1 if not found
    public static int floorOfANumber(int[] nums, int target){
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
        return end;
    }
}
