//package javakunal.oops;
//
//import javakunalquestions.javakunalas2.Greeting;
//
//interface Student {
//
//}
//
//public class ExampleClass {
//
//    public static void main(String[] args) {
//        Student student1 = new Student();
//        System.out.println(student1.roll + " " + student1.name + " " + student1.marks);
//        // Assign values to object by intitalizing variables
//        student1.roll = 1;
//        student1.name = "Sainadh Vatturi";
//        student1.marks =  8.64f;
//        System.out.println(student1.roll + " " + student1.name + " " + student1.marks);
//        // Assign values to variables using Constructor functions
//        Student student2 = new Student(2, "Bhavesh", 8.99f);
//        System.out.println(student2.roll + " " + student2.name + " " + student2.marks);
//        // Method inside an object
//        student1.greeting();
//        // Change Name
//        student2.changeName("Lokesh");
//        System.out.println(student2.roll + " " + student2.name + " " + student2.marks);
//        // object inside constructor function
//        Student random = new Student(student1);
//        System.out.println(random.roll + " " + random.name + " " + random.marks);
//    }
//}
//
//class Student{
//    int roll;
//    String name;
//    float marks;
//    // Default Constructor
//    Student (){
//
//    }
//    // Constructor function
//    Student (int roll, String name, float marks){
//        this.roll = roll;
//        this.name = name;
//        this.marks = marks;
//    }
//    // Method inside object
//    void greeting() {
//        System.out.println("Hello! My name is " + this.name);
//    }
//    void changeName(String newName){
//        this.name = newName;
//    }
//    Student (Student other){
//        this.roll = other.roll;
//        this.name = other.name;
//        this.marks = other.marks;
//
//    }
//}