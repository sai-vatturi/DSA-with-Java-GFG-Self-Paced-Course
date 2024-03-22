package linkedlist;

public class MergeKLists {
    public static void main(String[] args) {
        SinglyLinkedList list1 = new SinglyLinkedList();
        SinglyLinkedList list2 = new SinglyLinkedList();
        SinglyLinkedList list3 = new SinglyLinkedList();
        SinglyLinkedList list4 = new SinglyLinkedList();

        for (int i = 1; i <= 20; i = i + 4) {
            list1.insert(i);
        }
        for (int i = 2; i <= 20; i = i + 4) {
            list2.insert(i);
        }
        for (int i = 3; i <= 20; i = i + 4) {
            list3.insert(i);
        }
        for (int i = 4; i <= 20; i = i + 4) {
            list4.insert(i);
        }

        System.out.println("List 1: ");
        list1.display();
        System.out.println("List 2: ");
        list2.display();
        System.out.println("List 3: ");
        list3.display();
        System.out.println("List 4: ");
        list4.display();

    }
}
