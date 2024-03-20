package gfgclass.arrays;

public class MaximumSumSubArray {
    public static void main(String[] args) {
        int[] arr = {-6, -1, -8};
        System.out.println(findMaxSum(arr));
    }

    static int findMaxSum(int[] arr) {
        int n = arr.length;
        int maxSum = Integer.MIN_VALUE;
        int curSum = 0;
        for (int i = 0; i < n - 1; i++) {
            curSum = 0;
            for (int j = i; j < n; j++) {
                curSum = curSum + arr[j];
                maxSum = Math.max(maxSum, curSum);
            }
        }
        return maxSum;
    }

}
