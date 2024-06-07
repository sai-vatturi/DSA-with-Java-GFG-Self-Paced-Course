package oops.ex3.pkg1;


public class Class1 {
    // selection sort
    public void sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int minIndex = min(arr, i);
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
    int min(int[] arr, int i) {
        int min = i;
        for (int index = i + 1; index < arr.length; index++) {
            if (arr[index] < arr[min]) {
                min = index;
            }
        }
        return min;
    }
    // linear search
    public int search(int[] arr, int target) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
