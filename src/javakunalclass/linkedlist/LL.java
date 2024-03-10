package javakunalclass.linkedlist;

public class LL {

    Node head;
    Node tail;
    int size;

    LL() {
        this.size = 0;
    }

    private class Node {
       int value;
       Node next;
       public Node(int value) {
           this.value = value;
       }
       public Node(int value, Node next) {
           this.value = value;
           this.next = next;
       }
    }

    public void insertFirst(int value) {
        Node node = new Node(value);
        node.next = head;
        head = node;
        if (tail == null) {
            tail = head;
        }
        size++;
    }

    public void insertLast(int value) {
        if (tail == null) {
            insertFirst(value);
            return;
        }
        Node node  =  new Node(value);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insertAt(int index, int value) {
    
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

}
