import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number < 100 || number > 999) {
        } else {
        	System.out.println(findSum(number) + " " + findMul(number));
        }
    }

    static int findSum(int n) {
    	int sum = 0;
    	while (n > 0) {
    		sum += (n % 10);
    		n /= 10;
    	}
    	return sum;
    }
    static int findMul(int n) {
    	int mul = 1;
    	while (n > 0) {
    		mul = mul * (n%10);
    		n /= 10;
    	}
    	return mul;
    }
}
