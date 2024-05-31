package oops.ex2;

class Student {
    String name;
    int roll_no;
}

public class Test2 {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "John";
        s.roll_no = 2;
        System.out.println("Student name: " + s.name);
        System.out.println("Student roll no: " + s.roll_no);
    }
}