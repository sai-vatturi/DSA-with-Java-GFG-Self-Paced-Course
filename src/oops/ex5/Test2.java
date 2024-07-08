package oops.ex5;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class CheckStringPalindrome {
    static ArrayList<String> list;

    static void readAndStore(ArrayList<String> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Read and Store Strings to ArrayList");
        System.out.println("Enter number of Strings: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter " + (i + 1) + " String: ");
            list.add(sc.nextLine());
        }

        System.out.println("Read and Store Completed.");
    }

    static void display(ArrayList<String> list) {
        Iterator it = list.iterator();
        System.out.println("Strings in the ArrayList are: ");
        while (it.hasNext()) {
            System.out.print((String) it.next() + " ");
        }
        System.out.println();
    }

    static boolean searchArray(ArrayList<String> list, String target) {
        Iterator it = list.iterator();
        System.out.println("Searching Array for " + target);
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str.equals(target)) {
                return true;
            }
        }

        return false;
    }

    static void printStringPalindrome(ArrayList<String> list) {
        Iterator it = list.iterator();
        System.out.println("Strings that are palindromes are: ");
        while (it.hasNext()) {
            String str = (String) it.next();
            if (checkPalindrome(str)) {
                System.out.print(str + " ");
            }
        }
        System.out.println();

    }

    static boolean checkPalindrome(String str) {
        int i = 0;
        int j = str.length() - 1;

        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        list = new ArrayList<>();

        System.out.println("Options: ");
        System.out.println("1. Read and store the strings into the ArrayList");
        System.out.println("2. Display the ArrayList");
        System.out.println("3. Search the ArrayList and print whether found or not");
        System.out.println("4. Print all the palindromes in the ArrayList.");
        System.out.println("5. Stop the process.");

        while (true) {
            System.out.println("Enter value from 1 - 5: ");
            int n = sc.nextInt();
            switch (n) {
                case 1:
                    readAndStore(list);
                    break;
                case 2:
                    display(list);
                    break;
                case 3:
                    System.out.println("Enter Target Element");
                    sc.nextLine();
                    String target = sc.nextLine();
                    if (searchArray(list, target)) {
                        System.out.println("Target is Found");
                    }
                    else {
                        System.out.println("Target is Not Found");
                    }
                    break;
                case 4:
                    printStringPalindrome(list);
                    break;
                case 5:
                    System.out.println("Exiting");
                    return;
                default:
                    System.out.println("Enter value in range 1-5!");
            }
        }
    }
}
