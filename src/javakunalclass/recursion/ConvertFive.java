package javakunalclass.recursion;

public class ConvertFive {
    public static void main(String[] args) {
        System.out.println(convertfive(1005));
    }
    static int convertfive(int num) {
        // Your code here
        int org = num;
        while (num > 0) {
            int digit = num % 10;
            int base = 1;
            if (digit == 0) {
                org = org + (base * 5);
            }
            base = base * 10;
            num = num / 10;
        }
        return org;
    }
}
