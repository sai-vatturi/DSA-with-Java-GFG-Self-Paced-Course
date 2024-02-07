package classlectures.cat;

import java.util.Arrays;

public class EquilibriumSum {
    public static void main(String[] args) {
        int[] arr = {-2, 5, 3, 2, 2, 6, -4, 2 };
        System.out.println(Arrays.toString(arr));
        System.out.println(findMaxSum(arr));
    }
    static int findMaxSum(int[] arr) {
        int n = arr.length;
        int[] prefixSum = new int[n];
        int[] suffixSum = new int[n];

        int ans = Integer.MIN_VALUE;

        prefixSum[0] = arr[0];

        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] +  arr[i];
        }

        suffixSum[n-1] = arr[n-1];

        if (prefixSum[n-1] == suffixSum[n-1]) {
            ans = Math.max(ans, prefixSum[n-1]);
        }

        for (int i = n - 2; i >= 0; i--) {
            suffixSum[i] = suffixSum[i + 1] + arr[i];

            if(suffixSum[i] == prefixSum[i]) {
                ans = Math.max(ans, prefixSum[i]);
            }
        }
        System.out.println(Arrays.toString(prefixSum));
        System.out.println(Arrays.toString(suffixSum));
        return ans;
    }
}
