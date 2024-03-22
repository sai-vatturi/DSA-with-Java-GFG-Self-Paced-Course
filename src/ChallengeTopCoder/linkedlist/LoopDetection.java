package linkedlist;

public class LoopDetection {
    static void loopDetection(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast.next != null && fast != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                System.out.println("Loop Detected");
                return;
            }
        }
        System.out.println("Loop Not Detected");
    }

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.insert(1);
        list.insertFirst(10);
        list.insert(20);
        // list.tail.next = list.head;
        loopDetection(list.head);
    }
}
