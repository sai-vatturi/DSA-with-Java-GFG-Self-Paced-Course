package javakunalclass.linkedlist;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        System.out.println(list.size);
        list.insertFirst(5);
        list.insertFirst(6);
        list.insertFirst(7);
        list.insertFirst(8);
        list.insertLast(4);
        list.insertLast(3);

        list.display();
    }
}
