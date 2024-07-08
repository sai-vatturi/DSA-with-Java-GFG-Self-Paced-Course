package oops.comparator_practice;

public class Student {
    int roll;
    String name;
    int age;

    public Student(int roll, String name, int age) {
        this.roll = roll;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {

        return this.roll + " " + this.name + " " + this.age;
    }
}
