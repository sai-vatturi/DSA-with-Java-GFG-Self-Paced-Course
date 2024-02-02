package classlectures;

import java.util.Arrays;

public class MarkingDuplicates {
    public static void main(String[] args) {
        int[] arr = {5,4,7,4,5};
        int n = arr.length;
        int p = n;
        for (int i = 0; i < n; i++) {
            int index = (arr[i] % p);
            arr[index] = arr[index] + p;
        }
        for (int i = 0; i < n; i++) {
            arr[i] /= p;

        }
        System.out.println(Arrays.toString(arr));

    }
}
