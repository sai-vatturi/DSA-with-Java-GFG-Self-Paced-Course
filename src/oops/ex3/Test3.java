package oops.ex3;

import java.util.Scanner;

class BuzzNumberException extends Exception {
    BuzzNumberException() {
        super("Buzz Number Exception Invoked.");
    }
}

class EvenNumberException extends Exception {
    EvenNumberException() {
        super("Even Number Exception Invoked.");
    }
}

class OddNumberException extends Exception {
    OddNumberException() {
        super("Odd Number Exception Invoked.");
    }
}

public class Test3 {
    static boolean checkBuzz(int n) {
        return n % 7 == 0 || n % 10 == 7;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        try {
            if (checkBuzz(n)) {
                throw new BuzzNumberException();
            }
            else if (n % 2 == 0) {
                throw new EvenNumberException();
            }
            else {
                throw new OddNumberException();
            }
        } catch (BuzzNumberException e) {
            System.out.println(e);

        } catch (EvenNumberException e) {
            System.out.println(e);

        } catch (OddNumberException e) {
            System.out.println(e.getMessage()); // we can use either e or e.getMessage() method

        } catch (Exception e) {
            System.out.println(e.getMessage());

        } finally {
            System.out.println("Execution Completed.");
        }
    }
}
