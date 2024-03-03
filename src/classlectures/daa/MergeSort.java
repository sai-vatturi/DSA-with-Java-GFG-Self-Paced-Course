package classlectures.daa;

import java.util.Arrays;
import java.util.Scanner;
class MergeSort {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter length of the array : ");
        int n = in.nextInt();
        int [] arr = new int[n];
        for (int i =0;i<arr.length;i++){
            arr[i]=in.nextInt();
        }
        System.out.println("Before Sorting : "+Arrays.toString(arr));
        mergeSort(arr, 0, arr.length - 1);
        System.out.println("After Sorting : " + Arrays.toString(arr));
    }

    private static void mergeSort(int[] arr, int start, int end) {
       if (end <= start) {
           return;
       }
       int mid = start + (end - start) / 2;
       mergeSort(arr, start, mid);
       mergeSort(arr, mid + 1, end);

       merge(arr, start, mid, end);
    }
    private static void merge(int[] arr, int start, int mid, int end) {
        int n1 = mid - start + 1;
        int n2 = end - mid;

        int L[] = new int[n1];
        int R[] = new int[n2];

        for (int i = 0; i < n1; ++i) {
            L[i] = arr[start + i];
        }
        for (int i = 0; i < n2; ++i) {
            R[i] = arr[mid + 1 + i];
        }

        int i = 0, j = 0;

        int k = 1;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }

    }


//    static int[] mergesort(int[] arr){
//        if(arr.length==1){
//            return arr;
//        }
//        int mid = arr.length/2;
//        int[] left = mergesort(Arrays.copyOfRange(arr,0,mid));
//        int[] right = mergesort(Arrays.copyOfRange(arr,mid,arr.length));
//        return merge(left,right);
//    }
//    static int[] merge(int[] first, int[] second){
//        int[] mix = new int[first.length+second.length];
//        int i=0;
//        int j=0;
//        int k=0;
//        while(i<first.length && j<second.length){
//            if(first[i]<second[j]){
//                mix[k]=first[i];
//                i++;
//            }
//            else {
//                mix[k]=second[j];
//                j++;
//            }
//            k++;
//        }
//        while(i<first.length){
//            mix[k]=first[i];
//            k++;
//            i++;
//        }
//        while(j<second.length){
//            mix[k]=second[j];
//            k++;
//            j++;
//        }
//        return mix;
//    }
}
