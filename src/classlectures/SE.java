package classlectures;

import java.util.Arrays;
import java.util.Scanner;

public class SE {
    // read 5
    // print 5
    // print in sorted order
    // fibanocci series of first largest
    // factorial of 2nd largest
    // check prime or composite for 3rd number
    // check 4th number is armstrong
    // check palindrome or not 5th number
    public static void main(String[] args) {
        int[] nums = new int[5];
        Scanner sc = new Scanner(System.in);

        // Taking input to an array
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter number " + (i  + 1) + ": ");
            nums[i] = sc.nextInt();
        }

        // Printing the array
        System.out.println("Entered Array is: ");
        System.out.println(Arrays.toString(nums));

        // Sorting and printing the array
        sortArray(nums);
        System.out.println("Sorted Array is: ");
        System.out.println(Arrays.toString(nums));

        // Checking Fibanocci of a number
        System.out.println("Fibannoci series for the largest value is: ");
        fibanocci(nums[nums.length - 1]);
        System.out.println();

        // Checking Factorial of a number
        System.out.println("Factorial for the second largest value is");
        System.out.println(factorial(nums[nums.length - 2]));

        // Checking prime or not
        System.out.println("Checking if 3rd number is prime or not: ");
        System.out.println(checkPrime(nums[nums.length - 3]));

        // Checking armstrong or not
        System.out.println("Checking if 4th largest number is armstrong or not: ");
        System.out.println(armstrong(nums[nums.length - 4]));

        // Checking palindrom or not
        System.out.println("Checking if 5th largest number is palindrome or not: ");
        System.out.println(checkPalindrome(nums[nums.length - 5]));
    }

    // sort the array using bubble sort
    public static void sortArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    swap(arr, i, j);
                }
            }
        }
    }
    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }


    public static void fibanocci(int n) {
        int a = 0;
        int b = 1;
        if (n == 0) {
            System.out.println(0);;
        }
        else if (n == 1) {
            System.out.println(1);;
        }
        else {
            System.out.print(0 + " " + 1 + " ");
            int c = 0;
            for (int i = 3; c <= n; i++) {
                c = a + b;
                System.out.print(c + " ");
                a = b;
                b = c;
            }
        }
    }
    public static long factorial (int n) {
        long fact = 1;
        for(int i = 1; i <= n; i++){
            fact = fact * i;
        }
        return fact;
    }
    public static boolean checkPrime(int n) {
        if(n == 2 || n == 3) {
            return true;
        }
        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }
        for (int i = 5; i < n; i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static boolean armstrong(int n) {
        int res = n;
        int ans = 0;
        while (n > 0) {
            int digit = n % 10;
            ans = (int) (ans + Math.pow(digit, 3));
            n = n / 10;
        }
        return res == ans;
    }
    public static boolean checkPalindrome(int n) {
        int res = n;
        int rev = 0;
        while (n > 0) {
            int digit = n % 10;
            rev = rev * 10 + digit;
            n = n / 10;
        }
        return res == rev;
    }


}
