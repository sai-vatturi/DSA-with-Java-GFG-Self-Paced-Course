package javakunalclass.oops.interfaces;

public class PowerEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Power engine starts");
    }

    @Override
    public void stop() {
        System.out.println("Power engine stop");

    }

    @Override
    public void accelerate() {
        System.out.println("Power engine accelerate");

    }
}
