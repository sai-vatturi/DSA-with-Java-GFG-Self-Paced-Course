package javakunalclass.recursion.l1;

public class NoOfZeroes {
    public static void main(String[] args) {
        System.out.println(countZeroes(20202, 0));
    }
    public static  int countZeroes(int n, int count) {
        if (n <= 0) return count;
        if (n % 10 == 0) return countZeroes(n / 10, count + 1);
        else return countZeroes(n / 10, count);
    }
}
