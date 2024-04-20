package javakunalclass.oops.interfaces;

public class CDPlayer implements MediaPlayer{

    @Override
    public void start() {
        System.out.println("Media player is started");
    }

    @Override
    public void stop() {
        System.out.println("Media Player is stopped");
    }
}
