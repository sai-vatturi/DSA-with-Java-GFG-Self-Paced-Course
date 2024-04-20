package java_collections_framework;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class LinkedListDemo2 {
    public static void main(String[] args) {

        LinkedList l = new LinkedList();

        //add method
        l.add("G");
        l.add("E");
        l.add("F");

        System.out.println(l);

        LinkedList l2 = new LinkedList(Arrays.asList("X", "Y", "Z", "A",  "B", "C"));
        // addAll method
        l.addAll(l2);

        System.out.println(l);

        // removeAll method
        l.removeAll(l2);
        System.out.println(l);

        // Collections sort() method
        Collections.sort(l);
        System.out.println(l);


    }
}
