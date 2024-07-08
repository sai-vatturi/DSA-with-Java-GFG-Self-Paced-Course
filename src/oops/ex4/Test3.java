package oops.ex4;

class TestClass extends Thread{
    synchronized void printSomething() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Printing: " + (i + 1));
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println("Another thread in work");
            }
        }
    }
    public void run() {
        printSomething();
    }
}

public class Test3 {
    public static void main(String[] args) {
        TestClass thread = new TestClass();

        Thread thread1 = new Thread(thread);
        Thread thread2 = new Thread(thread);

        thread1.start();
        thread2.start();
    }
}
