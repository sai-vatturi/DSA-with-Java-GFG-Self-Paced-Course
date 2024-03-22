package linkedlist;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class SinglyLinkedList {
    Node head, tail;
    int length;

    SinglyLinkedList() {
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    void insertFirst(int data) {
        Node newNode = new Node(data);
        length++;
        newNode.next = head;
        head = newNode;
    }

    void insert(int data) {
        Node newNode = new Node(data);
        length++;
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    void insertAt(int index, int data) {
        if (index == 0) {
            insertFirst(data);
        }
        if (index == this.length) {
            insert(data);
        }

        Node newNode = new Node(data);

        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        length++;
        newNode.next = temp.next;
        temp.next = newNode;
    }

    void deleteFirst() {
        if (head == null) {
            return;
        }
        this.head = head.next;
        length--;
    }

    void deleteLast() {
        if (head == null) {
            return;
        }
        if (length == 1) {
            deleteFirst();
        }
        length--;
        Node temp = head;
        for (int i = 0; i < length - 1; i++) {
            temp = temp.next;
        }
        temp.next = null;
    }

    void deleteAt(int index) {
        if (head == null) {
            return;
        }
        if (index == 0) {
            deleteFirst();
        }
        if (index == length) {
            deleteLast();
        }
        length--;
        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        temp.next = null;
    }

    int length() {
        Node temp = this.head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    void display() {
        Node temp = this.head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

}