package collections;

import java.util.HashSet;

public class HashSetDemo3 {
    public static void main(String[] args) {

        // Union, Intersection, Difference

        HashSet<Integer> set1 = new HashSet<>();

        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);

        System.out.println("HashSet 1: " + set1);

        HashSet<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(4);
        set2.add(5);

        System.out.println("HashSet 2: " + set2);

        // Union
        set1.addAll(set2);
        System.out.println("Union: " + set1);

        // Intersection
        // retainAll - except collection all will be removed
        set1.retainAll(set2);
        System.out.println("Intersection: " + set2);

        // Difference
        set1.removeAll(set2);
        System.out.println("Difference: " + set1); //[1, 2]

        //

    }
}
