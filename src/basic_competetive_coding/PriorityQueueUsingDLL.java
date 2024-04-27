package basic_competetive_coding;

public class PriorityQueueUsingDLL {
    private class Node {
        int data;
        int priority;
        Node prev;
        Node next;

        Node(int data, int priority) {
            this.data = data;
            this.priority = priority;
            this.prev = null;
            this.next = null;
        }
    }

    private class LinkedList {
        Node head, tail;

        void insert(int data, int priority) {
            Node newNode = new Node(data, priority);
            if (head == null) {
                head = newNode;
                tail = newNode;
            }
            else if (priority <= head.priority) {
                newNode.next = head;
                head.prev = newNode;
                head = newNode;
            }
            else if (priority > tail.priority) {
                tail.next = newNode;
                newNode.prev = tail;
                tail = newNode;
            }
            else {
                Node temp = head.next;
                while (temp.priority > priority) {
                    temp = temp.next;
                }
                temp.prev.next = newNode;
                newNode.next = temp.prev;
                newNode.prev = temp.prev.next;
                temp.prev = newNode.next;
            }

        }

        int peek() {
            return head.data;
        }
        boolean isEmpty() {
            return head == null;
        }
        int pop() {
            Node temp = head;
            int data = temp.data;
            head = head.next;
            head.prev = null;
            return data;
        }
    }

    public static void main(String[] args) {
        PriorityQueueUsingDLL priorityQueue = new PriorityQueueUsingDLL();
        PriorityQueueUsingDLL.LinkedList list = priorityQueue.new LinkedList();
        list.insert(2, 3);
        list.insert(3, 4);
        list.insert(4, 5);
        list.insert(6, 7);
        list.insert(1, 2);
        System.out.println(list.pop());
        System.out.println(list.peek());

    }
}
