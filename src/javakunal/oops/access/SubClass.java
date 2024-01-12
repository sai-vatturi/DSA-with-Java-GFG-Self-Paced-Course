package javakunal.oops.access;

public class SubClass extends A{

    public SubClass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        SubClass obj = new SubClass(23, "Sai Nadh");
        System.out.println(obj instanceof Object);
    }
}
