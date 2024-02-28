package collections;

import java.util.LinkedList;

public class LinkedListDemo3 {
    public static void main(String[] args) {

        LinkedList l = new LinkedList();

        // linked list specific methods
        l.add("dog");
        l.add("dog");
        l.add("horse");
        l.add("cat");

        System.out.println(l);

        l.addFirst("tiger");
        l.addLast("elephant");

        System.out.println(l);

        System.out.println(l.getFirst());
        System.out.println(l.getLast());

        l.removeFirst();
        l.removeLast();
        System.out.println(l);

    }
}
