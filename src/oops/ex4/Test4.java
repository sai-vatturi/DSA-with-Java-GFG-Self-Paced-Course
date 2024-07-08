package oops.ex4;

class AnotherTest implements Runnable {
    public void run() {
        doSomething();
    }
    synchronized void doSomething() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
            try {
                Thread.sleep(500);
            }
            catch (Exception e) {
                System.out.println("Thread Interrupted.");
            }
        }
        System.out.println("Execution Finished");
    }
}

public class Test4 {
    public static void main(String[] args) {
        AnotherTest thread = new AnotherTest();
        Thread thread1 = new Thread(thread);
        Thread thread2 = new Thread(thread);

        thread1.start();
        thread2.start();
    }
}
