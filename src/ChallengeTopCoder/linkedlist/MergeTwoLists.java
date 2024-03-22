package linkedlist;

public class MergeTwoLists {
    static Node mergeTwoLists(Node head1, Node head2) {
        Node dummy = new Node(-1);
        Node current = dummy;

        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                current.next = head1;
                head1 = head1.next;
            } else {
                current.next = head2;
                head2 = head2.next;
            }
            current = current.next;
        }
        while (head1 != null) {
            current.next = head1;
            head1 = head1.next;
        }
        while (head2 != null) {
            current.next = head2;
            head2 = head2.next;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        SinglyLinkedList list1 = new SinglyLinkedList();
        SinglyLinkedList list2 = new SinglyLinkedList();

        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) {
                list1.insert(i);
            }
            if (i % 2 == 0) {
                list2.insert(i);
            }
        }

        System.out.println("Original Lists: ");
        list1.display();
        list2.display();

        System.out.println("Merged Lists: ");
        list1.head = mergeTwoLists(list1.head, list2.head);
        list1.display();
    }
}