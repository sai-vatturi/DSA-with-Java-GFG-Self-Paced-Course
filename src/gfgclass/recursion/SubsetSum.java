package gfgclass.recursion;

public class SubsetSum {
    public static void main(String[] args) {
        int[] arr = {10, 5, 2, 3, 6};
        System.out.println(subsetSum(arr, 5, 8));
    }
    static int subsetSum(int[] arr, int n, int sum) {
        if (n == 0) {
            return sum == 0 ? 1 : 0;
        }
        return subsetSum(arr, n - 1, sum) + subsetSum(arr, n - 1, sum - arr[n - 1]);
    }
}
