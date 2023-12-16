package javakunalclass.arrays;

import java.util.ArrayList;

public class DynamicArrays {
    public static void main(String[] args) {
        // Creating Integer Arraylist (Dynamic Array)
        ArrayList<Integer> list = new ArrayList<>(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);
        // Replacing a  value
        list.set(2, 121);
        System.out.println(list);
        // Creating String Arraylist (Dynamic Array)
        ArrayList<String> stringList = new ArrayList<>(1);
        stringList.add("Hello");
        stringList.add("Hi");
        stringList.add("Where are you");
        System.out.println(stringList);

    }
}
