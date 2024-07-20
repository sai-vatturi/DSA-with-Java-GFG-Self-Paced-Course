package striver.sdesheet.greedy;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MinimumPlatforms {
    public static void main(String[] args) {
        int[] arr = {900, 940, 950, 1100, 1500, 1800};
        int[] dep = {910, 1200, 1120, 1130, 1900, 2000};
        System.out.println(findPlatformOptimal(arr, dep, arr.length));

    }

    // Brute Force Solution
    // 1. Maximum no of intersections at a given time for every arr and dep with other arr and dep




    // Optimal Solution

    // 1. Sort arrival and departure array seperately
    // 2. Set two pointers at arrival and departure
    // 2. Imagine being a human being and use count variable to see max number of platforms

    public static int findPlatformOptimal(int[] arr, int[] dep, int n) {
        Arrays.sort(arr);
        Arrays.sort(dep);
//        System.out.println(Arrays.toString(arr));
//        System.out.println(Arrays.toString(dep));

        int maxCount = 0;
        int i = 0;
        int j = 0;
        int count = 0;
        while (i < n) {
            if (arr[i] <= dep[j]) {
                count += 1;
                i = i + 1;
            }
            else {
                count = count  - 1;
                j = j  + 1;
            }
            maxCount = Math.max(maxCount, count);
        }

        return maxCount;
    }


}
