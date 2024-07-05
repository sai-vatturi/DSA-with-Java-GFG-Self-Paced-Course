package pat_training;

import java.util.HashMap;

public class SongsAirTime {
    public static void main(String[] args) {
        int[] arr = {10, 7, 9, 5, 2};
        System.out.println(currSum(arr, 21));
    }
    public static int currSum(int[] arr, int target) {
        int n = arr.length;
        int count = 0;

        for (int i = 0; i < n - 1; i++) {
            HashMap<Integer, Integer> map = new HashMap<>();
            int remaining_value = target - arr[i];
            for (int j = i + 1; j < n; j++) {
                if (map.containsKey(remaining_value - arr[j])) {
                    count++;
                }
                map.put(arr[j], j);
            }

        }
        return count;
    }
}
