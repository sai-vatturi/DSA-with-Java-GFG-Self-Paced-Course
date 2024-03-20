package gfgclass.arrays;

public class MaximumDifference {
    public static void main(String[] args) {
        int[] arr = {2, 3, 10, 6, 4, 8, 1};
        System.out.println(findMinDifference(arr));
    }

    static int findMinDifference(int[] arr) {
        int n = arr.length;
        int minDiff = arr[0];
        int res = arr[1] - arr[0];

        for (int  j = 1; j < n; j++) {
            res = Math.max(res, arr[j] - minDiff);
            minDiff = Math.min(minDiff, arr[j]);
        }

        return res;
    }
}
