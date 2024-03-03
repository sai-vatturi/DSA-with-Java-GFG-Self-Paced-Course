package leetcode;

class HelloWorld {
    public static void main(String[] args) {
        int n = 1;
        int s = 1;
        int[] a = {1};
        int min = 0;
        int max = 0;
        int sum = a[min];
        if (sum == s) {
            System.out.println(min + 1);
            System.out.println(max + 1);
        }
        while ((max < a.length-1) && (min >= 0) && (max >= 0) && (min < a.length-1)) {
            if (sum < s) {
                max++;
                sum += a[max];
            }
            else if (sum > s) {
                sum -= a[min];
                min++;
            }
            else {
                System.out.println(min + 1);
                System.out.println(max + 1);
                break;
            }
        }
        System.out.println("-1");
    }
}