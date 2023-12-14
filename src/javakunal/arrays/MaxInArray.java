package javakunal.arrays;

public class MaxInArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(maxOfArray(arr));

    }
    public static int maxOfArray(int[] arr){
        if(arr == null){
            return -1;
        }
        if(arr.length == 0){
            return -1;
        }

        int max = arr[0];
        for(int i = 0; i < arr.length; i ++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
