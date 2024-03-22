package linkedlist;

public class Reverse {
    static Node reverse(Node head) {
        Node current = head;
        Node prev = null;
        Node next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        for (int i = 1; i <= 5; i++) {
            list.insert(i);
        }
        System.out.println("Original List is");
        list.display();

        System.out.println("Reversed List is");
        list.head = reverse(list.head);
        list.display();
    }
}
