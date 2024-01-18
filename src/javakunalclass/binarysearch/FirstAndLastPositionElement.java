package javakunalclass.binarysearch;

public class FirstAndLastPositionElement {
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,4,5,5,6,7,8,9};
        System.out.println(firstAndLastElement(nums, 5));
    }
    public static int[] firstAndLastElement(int[] arr, int target){

        int[] ans = {-1, -1};
        ans[0] = search(arr, target, true);
        ans[1] = search(arr, target, false);
        return ans;

    }
    public static int search(int[] arr, int target, boolean findStartIndex){
        int ans = -1;
        int n = arr.length;
        int start = 0;
        int end = n - 1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // potential answer found
                ans = mid;
                if(findStartIndex){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }

            }
        }
        return ans;
    }
}
