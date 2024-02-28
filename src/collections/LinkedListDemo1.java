package collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo1 {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList(); // hertrogeneous data
        // homogeneous data
//        LinkedList<Integer> ll = new LinkedList<Integer>();
//        LinkedList<String> ll = new LinkedList<String>();

        ll.add(100);
        ll.add("Welcome");
        ll.add(15.5);
        ll.add('a');
        ll.add(true);
        System.out.println(ll);

        System.out.println(ll.size());
//        ll.remove(3);
        ll.remove((Object) 'a');
        System.out.println(ll);

        ll.add(3, null);
        System.out.println(ll);

        System.out.println(ll.get(1));

        ll.set(3, "Hey");
        System.out.println(ll);

        System.out.println(ll.contains("Java"));

        System.out.println(ll.isEmpty());

        // to read linkedlist
        // 1) for loop
        // 2) for each loop
        // 3) iterator()

        // 1) reading using  for loop
        for (int i = 0; i < ll.size(); i++) {
            System.out.print(ll.get(i) + " ");
        }
        System.out.println();

        // 2) using foreach loop
        for (Object e: ll) {
            System.out.print(e + " ");
        }
        System.out.println();

        // 3) Using iterator method
        Iterator it = ll.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();
    }
}
