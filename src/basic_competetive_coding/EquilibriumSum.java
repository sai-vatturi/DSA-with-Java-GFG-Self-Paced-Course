package basic_competetive_coding;

import java.util.Arrays;

public class EquilibriumSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 3, 5, 1};
        System.out.println(Arrays.toString(arr));
        System.out.println(findMaxSum(arr));
    }
    static int findMaxSum(int[] arr) {
        int n = arr.length;
        int[] prefixSum = new int[n];
        int[] suffixSum = new int[n];

        prefixSum[0] = arr[0];

        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] +  arr[i];
        }

        suffixSum[n-1] = arr[n-1];

        for (int i = n - 2; i >= 0; i--) {
            suffixSum[i] = suffixSum[i + 1] + arr[i];

            if(suffixSum[i] == prefixSum[i]) {
                return i;
            }
        }
        int diff = Integer.MAX_VALUE;
        int maxDiff = 0;
        int index = 0;
        for (int i = 0; i  < n; i++) {
            diff = Math.abs(prefixSum[i] - suffixSum[i]);
            if (diff < maxDiff) {
                maxDiff = diff;
                index = i;
            }
        }
        return index;
    }
}
