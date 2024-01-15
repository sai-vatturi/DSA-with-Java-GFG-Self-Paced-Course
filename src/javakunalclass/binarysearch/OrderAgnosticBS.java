package javakunalclass.binarysearch;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {-12, -11, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr2 = {9,7,4,2,1,-2};
        System.out.println(orderAgnosticBS(arr, 10));
        System.out.println(orderAgnosticBS(arr2, 9));
    }
    public static int orderAgnosticBS(int[] nums, int target){
        int start = 0;
        int end = nums.length - 1;
        boolean isAsc = nums[start] <= nums[end];;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(isAsc){
                if(target < nums[mid]){
                   end = mid - 1;
                } else if (target > nums[mid]){
                    start = mid + 1;
                } else{
                    return mid;
                }
            } else {
                if(target < nums[mid]){
                    start = mid + 1;
                } else if (target > nums[mid]){
                    end = mid - 1;
                } else{
                    return mid;
                }
            }
        }
        return -1;
    }
}
