package pat_training;

public class MaximumIndexProduct {
    public static void main(String[] args) {
        int[] arr = {-3, 4, 3, 6, 4, 5, -2};
        System.out.println(findMaxIndexProduct(arr));
    }

    private static int findMaxIndexProduct(int[] arr) {
        int n = arr.length;
        int left;
        int right;
        int maxProd = 0;
        for (int i = 1; i < n - 1; i++) {
            left = i - 1;
            right = i + 1;

            while (arr[left] < arr[i]) {
                left--;
                if (left == - 1) {
                    left = 0;
                    break;
                }
            }
            while (arr[right] < arr[i]) {
                right++;
                if (right == n) {
                    right = 0;
                    break;
                }
            }
            maxProd = Math.max(maxProd, left * right);

        }
        return maxProd;
    }
}
