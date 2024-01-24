package javakunalclass.linearseach;

public class PeakMountainArray {
    public static void main(String[] args) {
        int[] arr =  {0,1,0};
        System.out.println(findPeakLinear(arr));
        System.out.println(findPeakBinary(arr));
    }
    public static int findPeakLinear (int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i-1] ){
                return arr[i-1];
            }
        }
        return -1;
    }
    public static int findPeakBinary (int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return arr[mid];
            } else {
                start = mid + 1;
            }
        }
        return arr[start];
    }

}
