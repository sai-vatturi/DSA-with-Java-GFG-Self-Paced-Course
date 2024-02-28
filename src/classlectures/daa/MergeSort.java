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
        arr=mergesort(arr);
        System.out.println("After Sorting : " + Arrays.toString(arr));
    }
    static int[] mergesort(int[] arr){
        if(arr.length==1){
            return arr;
        }
        int mid = arr.length/2;
        int[] left = mergesort(Arrays.copyOfRange(arr,0,mid));
        int[] right = mergesort(Arrays.copyOfRange(arr,mid,arr.length));
        return merge(left,right);
    }
    static int[] merge(int[] first, int[] second){
        int[] mix = new int[first.length+second.length];
        int i=0;
        int j=0;
        int k=0;
        while(i<first.length && j<second.length){
            if(first[i]<second[j]){
                mix[k]=first[i];
                i++;
            }
            else {
                mix[k]=second[j];
                j++;
            }
            k++;
        }
        while(i<first.length){
            mix[k]=first[i];
            k++;
            i++;
        }
        while(j<second.length){
            mix[k]=second[j];
            k++;
            j++;
        }
        return mix;
    }
}
