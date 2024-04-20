package ChallengeTopCoder.linkedlist;

public class BitonicSort {
    static class Node {
        int data;
        Node prev, next;

        Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    static class LinkedList {
        Node head, tail;

        void insert(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                newNode.prev = tail;
                tail.next = newNode;
                tail = tail.next;

            }
        }

        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        void bitonicSort() {
            Node temp = head;
            Node current = temp.next;
            while (current != null) {
                if (temp.data > current.data) {
                    current = reverse(current);
                    head = merge(head, current);
                    while (tail.next != null) {
                        tail = tail.next;
                    }
                }
                current = current.next;
            }

        }

        static Node merge(Node head, Node current) {

            if (head == null && current == null) {
                return null;
            }
            if (head == null) {
                return current;
            }
            if (current == null) {
                return head;
            }
            Node first = head;
            Node second = current;
            Node dummy = new Node(-1);
            Node temp = dummy;

            while (first != null || second != null) {
                if (first.data <= second.data) {
                    temp.next = first;
                    first = first.next;
                    temp = temp.next;
                } else {
                    temp.next = second;
                    second = second.next;
                    temp = temp.next;
                }
            }
            while (first != null) {
                temp.next = first;
                first = first.next;
                temp = temp.next;
            }
            while (second != null) {
                temp.next = second;
                second = second.next;
                temp = temp.next;
            }
            return dummy.next;
        }

        static Node reverse(Node head) {
            Node temp = null;
            Node current = head;
            while (current != null) {
                temp = current.prev;
                current.prev = current.next;
                current.next = temp;
                current = current.next;
            }
            if (temp != null) {
                head = temp.prev;
            }
            return head;
        }
    }

    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        l1.insert(5);
        l1.insert(10);
        l1.insert(20);
        l1.insert(8);
        l1.insert(4);
        l1.insert(2);
        l1.insert(1);
        l1.display();
        l1.bitonicSort(); // Call bitonicSort instead of reverse directly
        l1.display();
    }
}
