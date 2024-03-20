package gfgclass.arrays;

public class StockBuyAndSell {
    public static void main(String[] args) {
        int[] arr = {100, 180, 260, 310, 40, 535, 695};
        System.out.println(findMaxProfit(arr, 0, arr.length - 1));
        System.out.println(maxProfit(arr));
    }

    private static int findMaxProfit(int[] arr, int start, int end) {

        if (end <= start) {
            return 0;
        }

        int profit = 0;

        for (int i = start; i < end; i++) {
            for (int j = i + 1; j <= end; j++) {
                if (arr[j] > arr[i]) {
                    int cur_profit = arr[j] - arr[i] + findMaxProfit(arr, start, i - 1) + findMaxProfit(arr, j + 1, end);
                    profit = Math.max(profit, cur_profit);
                }
            }
        }
        return profit;
    }

    private static int maxProfit(int[] arr) {
        int n = arr.length;
        int profit = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[i - 1]) {
                profit += arr[i] - arr[i-1];
            }
        }
        return profit;
    }
}
