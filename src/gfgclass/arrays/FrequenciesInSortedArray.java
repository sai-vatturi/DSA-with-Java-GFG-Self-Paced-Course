package gfgclass.arrays;

public class FrequenciesInSortedArray {
    public static void main(String[] args) {
        int[] arr = {40, 50, 50, 50};
        getFreq(arr);

    }
    static void getFreq(int[] arr) {
        int n = arr.length;
        int count = 1;
        int current = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] == current) {
                count++;
            }
            if (arr[i] != current) {
                System.out.println(current + " " + count);
                current = arr[i];
                count = 1;
            }
        }
        System.out.println(current + " " + count);
    }
}
