package javakunalclass.linkedlist;

public class Main {
    public static void main(String[] args) {
        Integer myInteger = new Integer(10);
        System.out.println("Before method call: " + myInteger);

        modifyInteger(myInteger);

        System.out.println("After method call: " + myInteger);
    }
    public static void modifyInteger(Integer num) {
        // This method modifies the value of the Integer object
        num = num + 5;
        System.out.println("Inside method: " + num);
    }

}
