package javakunalclass.oops.interfaces;

public class NiceCar {
    private Engine engine;

    private MediaPlayer chPlayer = new CDPlayer();

    public NiceCar(){
        engine = new ElectricEngine();
    }
    public void startEngine(){
        engine.start();
    }
    public void startMusic(){
        chPlayer.stop();
    }
    public void upgradeEngine(){
        this.engine = new ElectricEngine();
    }
}
