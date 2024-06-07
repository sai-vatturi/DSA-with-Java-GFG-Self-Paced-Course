package oops.ex3;
//interface Vehicle {
//    void changeGear(int a);
//    static void speedUp(int a) {
//        System.out.println("Speed changed to " + a);
//    }
//    default void applyBrakes(int a) {
//        System.out.println("Brakes applied and vehicle speed is reduced to " + a);
//    }
//}x
//class Bus implements Vehicle{
//    public void changeGear(int a) {
//        System.out.println("Bus Gear is changed to " + a);
//    }
//}
//class Car implements Vehicle{
//    public void changeGear(int a) {
//        System.out.println("Car Gear is changed to " + a);
//    }
//}
//class Bike implements Vehicle{
//    public void changeGear(int a) {
//        System.out.println("Bike Gear is changed to " + a);
//    }
//}
abstract class Vehicle {
    abstract void changeGear(int a);
    void speedUp(int a) {
        System.out.println("Vehicles Speed changed to " + a);
    }
    abstract void applyBrakes(int a);
}

class Bus extends Vehicle{
    public void changeGear(int a) {
        System.out.println("Bus Gear is changed to " + a);
    }
    void applyBrakes(int a) {
        System.out.println("Brakes applied and bus speed reduced to " + a);
    }

}
class Car extends Vehicle{
    public void changeGear(int a) {
        System.out.println("Car Gear is changed to " + a);
    }
    void applyBrakes(int a) {
        System.out.println("Brakes applied and car speed reduced to " + a);
    }
}
class Bike extends Vehicle{
    public void changeGear(int a) {
        System.out.println("Bike Gear is changed to " + a);
    }
    void applyBrakes(int a) {
        System.out.println("Brakes applied and bike speed reduced to " + a);
    }
}

public class Test1 {
    public static void main(String[] args) {
        Vehicle bus, car, bike;
        bus = new Bus();
        car = new Car();
        bike = new Bike();
        // Testing bus
        bus.changeGear(2);
        bus.speedUp(40);
        bus.applyBrakes(10);

        // Testing car
        car.changeGear(5);
        car.speedUp(60);
        car.applyBrakes(20);

        // Testing bike
        bike.changeGear(4);
        bike.speedUp(30);
        bike.applyBrakes(0);
    }
}
