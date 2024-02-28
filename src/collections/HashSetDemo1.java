package collections;

import java.io.ObjectStreamException;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo1 {
    public static void main(String[] args) {

        // default homogeneous hashset
        HashSet hs = new HashSet(); // default capacity 16, load factor - 0.75

        // HashSet hs = new HashSet(100, 0.90f); // configure capacity and load factor
        // default hetrogeneous hashset
        // HashSet<Integer> hs = new HashSet<Integer>();

        hs.add(100);
        hs.add("welcome");
        hs.add(16.4);
        hs.add('A');
        hs.add(true);
        hs.add(null);

        // insertion order is not preserved
        System.out.println(hs); //[null, A, 100, 16.4, welcome, true]

        hs.remove("welcome");
        System.out.println(hs);

        System.out.println(hs.size());

        System.out.println(hs.contains(true));

        System.out.println(hs.isEmpty());

        // reading elements in a hash set using hashset
        for (Object e : hs) {
            System.out.print(e + " ");
        }
        System.out.println();
        // reading elements in a hash set using iterator
        Iterator it = hs.iterator();

        while (it.hasNext()) {
            System.out.print(it.next() + "  ");
        }

    }
}
