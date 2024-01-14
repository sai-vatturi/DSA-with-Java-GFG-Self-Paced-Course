package javakunal.oops.interfaces;

import javax.print.attribute.standard.Media;

public class Main {
    public static void main(String[] args) {
        Engine car = new Car();
        car.start();
        car.accelerate();
        car.start();

        MediaPlayer carMedia = new Car();
        carMedia.start();
        carMedia.stop();

        Car car1 = new Car();
        car1.start();
        car1.accelerate();
        car1.brake();
        car1.start();

        NiceCar niceCar = new NiceCar();
        niceCar.startEngine();
        niceCar.startMusic();
        niceCar.upgradeEngine();
    }
}
