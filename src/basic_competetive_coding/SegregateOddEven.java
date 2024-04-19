package basic_competetive_coding;

public class SegregateOddEven {
    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }
    private static class LinkedList {
            Node head, tail;

            void insert(int data) {
                Node newNode = new Node(data);
                if (head == null) {
                    head = newNode;
                    tail = newNode;
                } else {
                    tail.next = newNode;
                    tail = newNode;
                }
            }

            void display() {
                Node temp = head;
                while (temp != null) {
                    System.out.print(temp.data + " ");
                    temp = temp.next;
                }
            }

            Node segregateOddEven() {
                Node current = head;
                Node oddHead = new Node(-1);
                Node evenHead = new Node(-1);

                Node oddCurrent = oddHead;
                Node evenCurrent = evenHead;

                while (current != null) {
                    if (current.data % 2 == 0) {
                        evenCurrent.next = current;
                        evenCurrent = evenCurrent.next;
                    } else {
                        oddCurrent.next = current;
                        oddCurrent = oddCurrent.next;
                    }
                    current = current.next;
                }

                oddCurrent.next = evenHead.next;
                evenCurrent.next = null;
                return oddHead.next;
            }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);

        System.out.println("Original List:");
        list.display();

        Node segregatedListHead = list.segregateOddEven();

        System.out.println("\nAfter Segregation:");
            LinkedList segregatedList = new LinkedList();
            segregatedList.head =segregatedListHead;
        segregatedList.display();
        }
    }