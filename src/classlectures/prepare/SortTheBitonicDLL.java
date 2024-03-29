package classlectures.prepare;

public class SortTheBitonicDLL {
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

        Node reverse(Node head) {
            Node temp = null;
            Node current = head;
            while (current != null) {
                temp = current.prev;
                current.prev = current.next;
                current.next = temp;
                current = current.prev;
            }
            if (temp != null) {
                head = temp.prev;
            }
            return head;
        }
        Node split(Node head) {
            Node slow = head;
            Node fast = head;

            while (fast.next != null && fast.next.next != null) {
                    fast = fast.next.next;
                    slow = slow.next;
            }
            Node temp = slow.next;
            slow.next = null;
            return temp;
        }
        static Node merge(Node first, Node second) {
           if (first == null) {
               return second;
           }
           if (second == null) {
               return first;
           }
           if (first.data < second.data) {
               first.next = merge(first.next, second);
               first.next.prev = first;
               first.prev = null;
               return first;
           }
           else {
               second.next = merge(first, second.next);
               second.next.prev = second;
               second.prev = null;
               return second;
           }
        }
        Node mergeSort(Node head) {
            if (head == null || head.next == null) {
                return head;
            }
            Node first = head;
            Node second = split(head);

            first = mergeSort(first);
            second = mergeSort(second);

            return merge(first, second);
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
        l1.head = l1.mergeSort(l1.head);
        l1.display();
    }
}
