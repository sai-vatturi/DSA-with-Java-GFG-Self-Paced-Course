package gfgclass.arrays;

public class TrappingRainWater {
    public static void main(String[] args) {
        int[] arr = {1,0,2,1,0,1,3,2,1,2,1};
//        System.out.println(rainWater(arr));
//        System.out.println(optimizedRainWater(arr));
//        System.out.println(trapRainWater(arr));
//        System.out.println(trap(arr));
    }

    private static int rainWater(int[] arr) {
        long startTime = System.nanoTime();

        int n = arr.length;
        int res = 0;
        for (int i = 1; i < n - 1; i++) {
            int lMax = arr[i];
            for (int j = 0; j < i; j++) {
                lMax = Math.max(lMax, arr[j]);
            }
            int rMax = arr[i];
            for (int j = i + 1; j < n; j++) {
                rMax = Math.max(rMax, arr[j]);
            }
            res += Math.min(lMax, rMax) - arr[i];
        }
        long endTime   = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println(totalTime);
        return res;
    }

    private static int optimizedRainWater(int[] arr) {
        long startTime = System.nanoTime();

        int n = arr.length;
        int res = 0;
        int[] prefix = new int[n];
        prefix[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefix[i] = Math.max(arr[i], prefix[i-1]);
        }

        int[] suffix = new int[n];
        suffix[n-1] = arr[n-1];
        for (int i = n - 2; i >= 0; i--) {
            suffix[i] = Math.max(arr[i], suffix[i+1]);
        }
        for (int i = 1; i < n - 1; i++) {
            res += Math.min(prefix[i], suffix[i]) - arr[i];
        }
        long endTime   = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println(totalTime);
        return res;
    }
    private static int trapRainWater(int[] arr) {
        long startTime = System.nanoTime();

        int left = 0;
        int right = arr.length - 1;
        int leftMax = 0;
        int rightMax = 0;
        int res = 0;

        while (left <= right) {
            if (arr[left] <= arr[right]) {
                if (arr[left] >= leftMax) {
                    leftMax = arr[left];
                }
                else {
                    res += leftMax - arr[left];
                }
                left++;
            }
            else {
                if (arr[right] >= rightMax) {
                    rightMax = arr[right];
                }
                else {
                    res+= rightMax - arr[right];
                }
                right--;
            }

        }
        long endTime   = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println(totalTime);

        return res;
    }

        static  int trap(int[] arr) {
            long startTime = System.nanoTime();

            int n = arr.length;
            int left = 0;
            int right = n - 1;
            int lMax = 0;
            int rMax = 0;
            int min = Integer.MAX_VALUE;
            int res = 0;
            int rCount = 0;
            int rStore = 0;
            // while (left < right) {
            //     while (left < n && arr[left] == 0) {
            //         left++;
            //     }
            //     while (right > 0 && arr[right] == 0) {
            //         right--;
            //     }
            //     break;
            // }
            while (left < n && arr[left] == 0) {
                left++;
            }
            while (right > left && arr[right] == 0) {
                right--;
            }



            while (left < right) {
                if (arr[left] > lMax) {
                    lMax = arr[left];
                    if (rCount > 1) {
                        // for (int i = 0; i < rCount; i++) {
                        //     res += arr[right + rCount] - arr[right];
                        // }

                        while (rCount > 1) {
                            res += arr[right + rCount] - rStore;
                            rCount--;
                        }
                    }
                }
                if (arr[right] > rMax) {
                    rMax = arr[right];
                    rCount = 0;
                }
                // lMax = Math.max(arr[left], lMax);
                // rMax = Math.max(arr[right], rMax);

                min = Math.min(lMax, rMax);
                if (rCount == 0) {
                    rStore = min;
                }

                if (arr[left] < min) {
                    res += min - arr[left];
                    // rCount++;
                }
                if (arr[right] < min) {
                    res += min - arr[right];
                }
                rCount++;
                left++;
                right--;
                if (left == right) {
                    if (min > arr[left]) {
                        res += min - arr[left];
                    }
                }
            }
            long endTime   = System.nanoTime();
            long totalTime = endTime - startTime;
            System.out.println(totalTime);
            return res;
        }

}
