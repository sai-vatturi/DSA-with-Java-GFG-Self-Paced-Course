package pat_training;

public class ThiefRobbingHouse {
    public static void main(String[] args) {
        int n = 8;
        int[] arr = {102, 101, 5, 7, 99, 1, 2, 3};
        System.out.println(findMaximumAmound(n, arr));

    }

    private static int findMaximumAmound(int n, int[] arr) {
        int maxSum = 0;
        int currSum = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i - 1] > arr[i]) {
                currSum = arr[i];
            }
            else {
                currSum += arr[i];
            }
            maxSum = Math.max(maxSum, currSum);
        }
        return maxSum;
    }
}
