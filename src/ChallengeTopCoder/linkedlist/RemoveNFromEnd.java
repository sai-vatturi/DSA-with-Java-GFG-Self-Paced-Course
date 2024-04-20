package ChallengeTopCoder.linkedlist;

public class RemoveNFromEnd {
    Node removeNFromEnd(Node head, int n) {
        if (head == null || head.next == null) {
            return null;
        }
        Node left = head;
        Node right = head;
        for (int i = 0; i < n - 1; i++) {
            right = right.next;
        }
        if (right == null || right.next == null) {
            return head.next;
        }
        Node current = left;
        while (right != null && right.next != null) {
            right = right.next;
            current = left;
            left = left.next;
        }
        current.next = current.next.next;
        return head;
    }

    static Node removeNthFromEnd(Node head, int index) {
        if (head == null) {
            return null;
        }
        int length = getLength(head);
        if (length == 1) {
            return null;
        }
        if (length == index) {
            head = head.next;
            return head;
        }
        Node current = head;
        for (int i = 0; i < length - index - 1; i++) {
            current = current.next;
        }
        current.next = current.next.next;
        return head;
    }

    static int getLength(Node head) {
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        removeNthFromEnd(list.head, 2);
        list.display();
    }
}
