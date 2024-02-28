package collections;

import java.util.*;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        // Declare ArrayList
//        ArrayList al = new ArrayList();
//        ArrayList<Integer> al = new ArrayList<Integer>();
//        ArrayList<String> al = new ArrayList<String>();
        List al = new ArrayList();

        // add
        al.add(100);
        al.add("Welcome");
        al.add(15.5);
        al.add('a');
        al.add(true);


        System.out.println(al);

        // size
        System.out.println("Number of elements in array list: " + al.size());

        // remove
        al.remove(3);
        al.remove(Integer.valueOf(100));
        al.remove(true);
        System.out.println(al);

        // add with index
        al.add(0, "Java");
        al.add(al.size(), "Python");
        System.out.println(al);

        // retrieve specific value from index
        System.out.println(al.get(2));

        // Replace element
        al.set(al.size() - 1, "C#");
        System.out.println(al);

        // retrieve specific index from value
        System.out.println(al.indexOf("Java"));

        // search if an element contains inside a list
        System.out.println(al.contains("C#"));

        // isEmpty()
        System.out.println(al.isEmpty());

        // how to read the data
        // 1) for loop
        // 2) for each loop
        // 3) iterator()

        // 1) reading elements using for loop
        System.out.print("Print array using for loop:   ");
        for (int i = 0; i < al.size(); i++) {
            System.out.print(al.get(i) + " ");
        }

        // 2) reading elements using for each loop
        System.out.println();
        System.out.print("Print array using for each loop:   ");
        for (Object e: al) {
            System.out.print(e + " ");
        }

        // 3) reading elements using iterator method
        System.out.println();
        System.out.print("Print array using iterator method:   ");
        Iterator it = al.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }

        // addAll
        System.out.println();
        ArrayList al2 = new ArrayList(Arrays.asList("D", "A", "B"));
        al.addAll(al2);
        al.addAll(al2);
        System.out.println(al);

        // removeAll
        al.removeAll(al);
        System.out.println(al);

        // Sorting
        Collections.sort(al2);
        System.out.println(al2);

        // reverse order sorting
        Collections.sort(al2, Collections.reverseOrder());
        System.out.println(al2);

        Collections.shuffle(al2);
        System.out.println(al2);
    }
}
