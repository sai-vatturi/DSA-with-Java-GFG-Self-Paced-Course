package oops.comparator_practice;

import java.util.ArrayList;
import java.util.Collections;

public class Simple {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList();
        list.add(new Student(1001, "Bhavesh", 20));
        list.add(new Student(1005, "Aakash", 21));
        list.add(new Student(1003, "Kartik", 22));

        System.out.println("Original ");

        System.out.println(list);

    }

}
