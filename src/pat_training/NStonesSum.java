package pat_training;

import java.util.Arrays;

public class NStonesSum {
    public static void main(String[] args) {
        int n = 5;
        int[] arr = {10, 20, 30, 40, 50};
        int c = 60;
        System.out.println(findStoneSum(n, arr, c));
    }

    private static int findStoneSum(int n, int[] arr, int c) {
        int currSum = arr[0];
        int boxCount = 1;
        Arrays.sort(arr);
        for (int i = 1; i < n; i++) {
            if (currSum + arr[i] == c ) {
                boxCount += 1;
                currSum = 0;
            }
            else if (currSum + arr[i] > c) {
                boxCount += 1;
                currSum = arr[i];
            }
            else {
                currSum = currSum + arr[i];
            }

        }
        return boxCount;
    }
}
