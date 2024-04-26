//package ChallengeTopCoder.linkedlist;
//
//public class reorderList {
//    public static void main(String[] args) {
//        SinglyLinkedList list = new SinglyLinkedList();
//        list.insert(1);
//        list.insert(2);
//        list.insert(3);
//        list.insert(4);
//        list.insert(5);
//        list.insert(6);
//
//        list.display();
//        // System.out.println(split(list.head).data);
//    }
//
//    static Node reOrderList(Node head) {
//        Node temp1 = head;
//        Node slow = head;
//        Node fast = head.next;
//        while (fast.next != null && fast.next.next != null) {
//            fast = fast.next.next;
//            slow = slow.next;
//        }
//        Node temp2 = slow.next;
//        slow.next = null;
//
//        temp2 = reverse(temp2);
//
//        return merge(temp1, temp2);
//    }
//
//    static Node merge(Node temp1, Node temp2) {
//        Node dummy = new Node(-1);
//        Node current = dummy;
//        while (temp1 != null || temp2 != null) {
//            current.next = temp1;
//            current = current.next;
//            temp1 = temp1.next;
//            current.next = temp2;
//            current = current.next;
//            temp2 = temp2.next;
//        }
//        while (temp1 != null) {
//            current.next = temp1;
//            temp1 = temp1.next;
//        }
//        while (temp2 != null) {
//            current.next = temp2;
//            temp2 = temp2.next;
//        }
//        return dummy.next;
//    }
//
//    static Node reverse(Node head) {
//        Node current = head;
//        Node prev = null;
//        Node next = null;
//        while (current != null) {
//            next = current.next;
//            current.next = prev;
//            prev = current;
//            current = next;
//        }
//        return prev;
//    }
//}
