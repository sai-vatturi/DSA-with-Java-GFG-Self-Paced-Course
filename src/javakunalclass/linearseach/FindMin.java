package javakunalclass.linearseach;

public class FindMin {
    public static void main(String[] args) {
        int[] arr = {4,6,-2,5,7,4,6,7};
        System.out.println(minInArray(arr));
    }
    public static int minInArray(int[] arr){
        int min = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] <  min){
                min = arr[i];
            }
        }
        return min;
    }
}
