package sdot.linkedlist;

public class Main {
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }
    public static void main(String[] args) {
        Node newNode = new Node(0);
        Node new2 = newNode;
        new2.data = 2;
        System.out.println(newNode.data);
    }
}
