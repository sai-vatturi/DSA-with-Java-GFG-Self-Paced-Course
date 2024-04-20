package java_collections_framework;

import java.util.*;

public class Tesy {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(5);
        list.add(8);
        System.out.println(list);
        LinkedList<Integer> list2 = new LinkedList<>(list);
        list2.add(258);
        list2.add(453);
        list2.add(153);
        System.out.println(list2);

    }
}
